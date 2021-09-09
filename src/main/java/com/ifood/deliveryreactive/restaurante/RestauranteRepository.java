package com.ifood.deliveryreactive.restaurante;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface RestauranteRepository extends ReactiveMongoRepository<Restaurante, String> {
    Mono<Restaurante> findByNome(String nome);
}
