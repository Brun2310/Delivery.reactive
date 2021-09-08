package com.ifood.deliveryreactive.restaurante;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class RestauranteService {

    private final RestauranteRepository restauranteRepository;

    public Flux<Restaurante> listarTodos() {
        return restauranteRepository.findAll();
    }

    public Mono<Restaurante> inserirRestaurante(RestauranteRequest restauranteRequest) {
        var restaurante = restauranteRequest.convert();
        return restauranteRepository.save(restaurante);
    }

//    public Mono<Restaurante> inserirRestaurante(RestauranteRequest restauranteRequest) {
//        return Mono.create(mono -> {var restaurante = restauranteRequest.convert();
//        restauranteRepository.save(restaurante); });
//    }

}
