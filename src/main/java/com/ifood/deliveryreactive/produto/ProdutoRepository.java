package com.ifood.deliveryreactive.produto;

import com.ifood.deliveryreactive.restaurante.Restaurante;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface ProdutoRepository extends ReactiveMongoRepository<Produto, String> {
    Flux<Produto> findByRestaurante(Mono<Restaurante> restaurante);
}
