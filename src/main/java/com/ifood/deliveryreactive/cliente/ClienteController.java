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
    @GetMapping
    public Mono<Cliente> inserirCliente(@RequestBody ClienteRequest clienteRequest) {
        return  clienteService.inserirCliente(clienteRequest);
    }


}
