package com.ifood.deliveryreactive.produto;

import com.ifood.deliveryreactive.restaurante.Restaurante;
import com.ifood.deliveryreactive.restaurante.RestauranteRepository;
import com.ifood.deliveryreactive.restaurante.RestauranteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RequiredArgsConstructor
@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;
    private final RestauranteService restauranteService;

    public Flux<Produto> listarTodos() { return  produtoRepository.findAll().switchIfEmpty(Flux.empty());}

    public Mono<Produto> inserirProduto(Produto produto) { // TODO consertar relação com restaurante
        Restaurante restaurante = new Restaurante();
        BeanUtils.copyProperties(restauranteService.findById(produto.getRestaurante().getId()),restaurante); // metodo nao funciona
        //System.out.println(restaurante);
        produto.setRestaurante(restaurante);
        return produtoRepository.save(produto).switchIfEmpty(Mono.empty());
    }

    public Mono<Produto> atualizar(Produto produto, String id) {
        produto.setId(id);
        return produtoRepository.save(produto).switchIfEmpty(Mono.empty());
    }

    public Mono<Void> delete(String id) {
        return this.produtoRepository.deleteById(id).switchIfEmpty(Mono.empty());
    }

}
