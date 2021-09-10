package com.ifood.deliveryreactive.restaurante;

import com.ifood.deliveryreactive.produto.Produto;
import com.ifood.deliveryreactive.produto.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Comparator;

@Service
@RequiredArgsConstructor
public class RestauranteService {

    private final RestauranteRepository restauranteRepository;
    private final ProdutoRepository produtoRepository;

    public Flux<Restaurante> listarTodos() {
        return restauranteRepository.findAll().switchIfEmpty(Flux.empty());
    }

    public Mono<Restaurante> inserirRestaurante(Restaurante restaurante) {
        return restauranteRepository.save(restaurante).switchIfEmpty(Mono.empty());
    }

    public Flux<Produto> produtosMaisVendidos(String id) { // TODO testar funcionalidade
        var restaurante = findById(id);
        return produtoRepository.findByRestaurante(restaurante)
                .sort(Comparator.comparing(Produto::getVendas)).switchIfEmpty(Flux.empty());
    }

    public Mono<Restaurante> findById(String id) {
        return this.restauranteRepository.findById(id).switchIfEmpty(Mono.empty());
    }

    public Mono<Restaurante> atualizar(Restaurante restaurante, String id) {
        restaurante.setId(id);
        return restauranteRepository.save(restaurante).switchIfEmpty(Mono.empty());
    }

    public Mono<Void> delete(String id) {
        return this.restauranteRepository.deleteById(id).switchIfEmpty(Mono.empty());
    }

}
