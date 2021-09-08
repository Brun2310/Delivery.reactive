package com.ifood.deliveryreactive;

import com.ifood.deliveryreactive.cliente.ClienteRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication

public class DeliveryReactiveApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeliveryReactiveApplication.class, args);
    }

}

/*

    TODO Consulta dos ultimos pedidos de um cliente
    TODO Consulta dos produtos mais vendidos de um restaurante (Testar)


 */
