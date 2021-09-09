package com.ifood.deliveryreactive.entregador;

import com.ifood.deliveryreactive.pedido.Pedido;
import com.ifood.deliveryreactive.pedido.PedidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class EntregadorService {

    private final EntregadorRepository entregadorRepository;

    public Flux<Entregador> listarTodos() { return  entregadorRepository.findAll().switchIfEmpty(Flux.empty());}

    public Mono<Entregador> inserirEntregador(Entregador entregador) {
        //var cliente  = clienteRequest.convert();
        return entregadorRepository.save(entregador);

    }

}
