package com.ifood.deliveryreactive.entregador;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/entregador")
public class EntregadorController {

    private final EntregadorService entregadorService;

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping
    public Flux<Entregador> listarTodos() { return entregadorService.listarTodos(); }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PostMapping
    public Mono<Entregador> inserirEntregador(@RequestBody Entregador entregador) {
        return  entregadorService.inserirEntregador(entregador);
    }

}
