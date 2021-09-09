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
        //var restaurante = restauranteRequest.convert();
        return restauranteRepository.save(restaurante);
    }

    public Flux<Produto> listarMaisVendidos(Mono<Restaurante> restaurante) {
        return produtoRepository.findByRestaurante(restaurante)
                .sort(Comparator.comparing(Produto::getVendas)).switchIfEmpty(Flux.empty());
    }

    public Mono<Restaurante> findByNome(String nome) {
        return this.restauranteRepository.findByNome(nome).switchIfEmpty(Mono.empty());
    }

    /*public Mono<Restaurante> delete(String id) {
        var restaurante = restauranteRepository.findByNome(nome);
        return this.restauranteRepository.deleteById(id); //TODO-> .orElse(ERROR)
    }

    public Mono<Produto> atualizar(Mono<Restaurante> restaurante) {

    }*/

}
