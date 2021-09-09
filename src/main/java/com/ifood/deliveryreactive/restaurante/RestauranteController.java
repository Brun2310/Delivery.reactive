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
    public Mono<Restaurante> inserirRestaurante(@RequestBody Restaurante restauranteRequest) {
        return restauranteService.inserirRestaurante(restauranteRequest);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping("/{nome}/produtos") //TODO testar
    public Flux<Produto> produtosMaisVendidos(@PathVariable String nome) {
        var restaurante = restauranteService.findByNome(nome);
        return restauranteService.listarMaisVendidos(restaurante);
    }

    /*@ResponseStatus(HttpStatus.ACCEPTED)
    @PatchMapping
    public Mono<Restaurante> atualizarRestaurante(@RequestBody RestauranteRequest restauranteRequest) {
        var restaurante = Mono.just(restauranteRequest.convert());
        return restauranteService.atualizar(restaurante);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @DeleteMapping
    public Mono<Void> deletarRestaurante(@RequestBody String nome) {
        //var restaurante = restauranteService.findByNome(nome);
        return restauranteService.deleteByNome(nome);
    }*/

}
