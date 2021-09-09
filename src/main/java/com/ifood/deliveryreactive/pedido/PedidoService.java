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

    public Mono<Pedido> inserirPedido(Pedido pedidoRequest) {
        //var cliente  = clienteRequest.convert();
        return pedidoRepository.save(pedidoRequest);

    }

}
