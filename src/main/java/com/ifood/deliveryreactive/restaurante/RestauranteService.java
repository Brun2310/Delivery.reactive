package com.ifood.deliveryreactive.restaurante;

import com.ifood.deliveryreactive.produto.Produto;
import com.ifood.deliveryreactive.produto.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Comparator;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RestauranteService {

    private final RestauranteRepository restauranteRepository;

    private final ProdutoRepository produtoRepository;

    public Flux<Restaurante> listarTodos() {
        return restauranteRepository.findAll();
    }

    public Mono<Restaurante> inserirRestaurante(RestauranteRequest restauranteRequest) {
        var restaurante = restauranteRequest.convert();
        return restauranteRepository.save(restaurante);
    }

    public Flux<Produto> listarMaisVendidos(Restaurante restaurante) {
        return produtoRepository.findByRestaurante(restaurante)
                .sort(Comparator.comparing(Produto::getVendas));
    }

    public Optional<Restaurante> findByNome(String nome) {
        return this.restauranteRepository.findByNome(nome);
    }

}
