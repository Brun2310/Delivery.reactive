package com.ifood.deliveryreactive.produto;

import com.ifood.deliveryreactive.restaurante.Restaurante;
import com.ifood.deliveryreactive.restaurante.RestauranteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;
    private final RestauranteRepository restauranteRepository;

    public Flux<Produto> listarTodos() { return  produtoRepository.findAll().switchIfEmpty(Flux.empty());}

    public Mono<Produto> inserirProduto(Produto produto) {
        Mono<Restaurante> restaurante = restauranteRepository.findByNome(produto.getRestaurante().getNome());
        produto.setRestaurante(restaurante.switchIfEmpty(Mono.empty()).block());
        return produtoRepository.save(produto);
    }

}
