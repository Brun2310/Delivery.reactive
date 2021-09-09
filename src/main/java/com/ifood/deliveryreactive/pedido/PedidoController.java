package com.ifood.deliveryreactive.pedido;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/pedido")
public class PedidoController {

    private final PedidoService pedidoService;

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping
    public Flux<Pedido> listarTodos() { return pedidoService.listarTodos(); }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PostMapping
    public Mono<Pedido> inserirPedido(@RequestBody Pedido pedido) {
        return  pedidoService.inserirPedido(pedido);
    }

}
