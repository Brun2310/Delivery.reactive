package com.ifood.deliveryreactive.cliente;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping
    public Flux<Cliente> listarTodos() { return clienteService.listarTodos(); }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PostMapping
    public Mono<Cliente> inserirCliente(@RequestBody Mono<Cliente> cliente) {
        return  clienteService.inserirCliente(cliente);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PatchMapping("/{id}")
    public Mono<Cliente> atualizarCliente(@RequestBody Mono<Cliente> cliente,
                                                  @PathVariable String id) {
        return clienteService.atualizar(cliente,id);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @DeleteMapping("/{id}")
    public Mono<Void> deletarCliente(@PathVariable String id) {
        return clienteService.delete(id);
    }

}
