package com.ifood.deliveryreactive.restaurante;

import com.ifood.deliveryreactive.produto.Produto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/restaurante")
public class RestauranteController {

    private final RestauranteService restauranteService;

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping
    public Flux<Restaurante> listarTodos() {
        return restauranteService.listarTodos();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Mono<Restaurante> inserirRestaurante(@RequestBody Restaurante restaurante) {
        return restauranteService.inserirRestaurante(restaurante);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping("/{id}/produtos") //TODO testar
    public Flux<Produto> produtosMaisVendidos(@PathVariable String id) {
        return restauranteService.produtosMaisVendidos(id);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PatchMapping("/{id}")
    public Mono<Restaurante> atualizarRestaurante(@RequestBody Restaurante restaurante,
                                                  @PathVariable String id) {
        return restauranteService.atualizar(restaurante,id);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @DeleteMapping("/{id}")
    public Mono<Void> deletarRestaurante(@PathVariable String id) {
        return restauranteService.delete(id);
    }

}
