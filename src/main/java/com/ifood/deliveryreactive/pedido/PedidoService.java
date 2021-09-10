package com.ifood.deliveryreactive.pedido;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public Flux<Pedido> listarTodos() { return  pedidoRepository.findAll().switchIfEmpty(Flux.empty());}

    public Mono<Pedido> inserirPedido(Pedido pedido) {
        return pedido.flatMap(pedidoRepository::save);
    }

    public Mono<Pedido> atualizar(Pedido pedido, String id) {
        return pedido.doOnNext(e->e.setId(id)).
                flatMap(pedidoRepository::save);
    }

    public Mono<Void> delete(String id) {
        return pedidoRepository.deleteById(id).switchIfEmpty(Mono.empty());
    }

}
