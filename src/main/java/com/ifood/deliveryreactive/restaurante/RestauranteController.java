package com.ifood.deliveryreactive.restaurante;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/restaurantes")
public class RestauranteController {

    private final RestauranteService restauranteService;

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping
    public Flux<Restaurante> listarTodos() {
        return restauranteService.listarTodos();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Mono<Restaurante> inserirRestaurante(@RequestBody RestauranteRequest restauranteRequest) {
        return restauranteService.inserirRestaurante(restauranteRequest);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping
    public Flux<Restaurante> produtosMaisVendidos() {
        return restauranteService.listarTodos();
    }

}
