package com.ifood.deliveryreactive.produto;

import com.ifood.deliveryreactive.restaurante.Restaurante;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ProdutoRepository extends ReactiveMongoRepository<Produto, Integer> {
    Flux<Produto> findByRestaurante(Restaurante restaurante);

}
