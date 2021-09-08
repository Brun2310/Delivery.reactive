package com.ifood.deliveryreactive.restaurante;

import com.ifood.deliveryreactive.produto.Produto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{nome}")
    public Flux<Produto> produtosMaisVendidos(@PathVariable String nome) {
        var restaurante = restauranteService.findByNome(nome).get();
        return restauranteService.listarMaisVendidos(restaurante);
    }

}
