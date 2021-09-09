package com.ifood.deliveryreactive.entregador;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntregadorRepository extends ReactiveMongoRepository<Entregador, String> {
}
