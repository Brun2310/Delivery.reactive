package com.ifood.deliveryreactive.produto;

import com.ifood.deliveryreactive.restaurante.Restaurante;
import com.ifood.deliveryreactive.restaurante.RestauranteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;
    private final RestauranteRepository restauranteRepository;

    public Flux<Produto> listarTodos() { return  produtoRepository.findAll().switchIfEmpty(Flux.empty());}

//    public Mono<Produto> inserirProdutos(Produto produto) {
//
//        //produto.doOnNext(e->e.setRestaurante()).
//          //      flatMap(produtoRepository::save);
//        //as(Function<? super Mono<T>,P> transformer)
//        //map(Function<? super T,? extends R> mapper)
//
//        //BeanUtils.copyProperties(telefoneClienteRequest, telefoneCliente);
//
//        //Mono<Restaurante> restaurante = restauranteRepository.findByNome(produto.getRestaurante().getNome());
//        //produto.setRestaurante(restaurante.doOnNext(result -> assertEquals(restaurante.block(), result)).subscribe()).switchIfEmpty(Mono.empty()));
//        return produtoRepository.save(produto);
//    }

    public Mono<Produto> inserirProduto(Mono<Produto> produto, String id) {
        //produto. = restauranteRepository.findById(produto.getRestaurante().getId();
        return produto.doOnNext(e->e.setId(id)).
                flatMap(produtoRepository::insert);
    }

}
