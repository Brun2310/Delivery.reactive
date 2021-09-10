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
    public Mono<Entregador> inserirEntregador(@RequestBody Mono<Entregador> entregador) {
        return  entregadorService.inserirEntregador(entregador);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PatchMapping("/{id}")
    public Mono<Entregador> atualizarEntregador(@RequestBody Mono<Entregador> entregador,
                                                  @PathVariable String id) {
        return entregadorService.atualizar(entregador,id);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @DeleteMapping("/{id}")
    public Mono<Void> deletarEntregador(@PathVariable String id) {
        return entregadorService.delete(id);
    }

}
