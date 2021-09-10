package com.ifood.deliveryreactive.restaurante;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestauranteRepository extends ReactiveMongoRepository<Restaurante, String> {
}
