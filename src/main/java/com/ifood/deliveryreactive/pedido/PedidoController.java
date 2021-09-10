package com.ifood.deliveryreactive.pedido;

import com.ifood.deliveryreactive.restaurante.Restaurante;
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
        return pedidoService.inserirPedido(pedido);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PatchMapping("/{id}")
    public Mono<Pedido> atualizarPedido(@RequestBody Pedido pedido,
                                                  @PathVariable String id) {
        return pedidoService.atualizar(pedido,id);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @DeleteMapping("/{id}")
    public Mono<Void> deletarPedido(@PathVariable String id) {
        return pedidoService.delete(id);
    }

}
