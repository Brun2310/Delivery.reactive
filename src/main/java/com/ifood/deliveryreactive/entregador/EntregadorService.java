package com.ifood.deliveryreactive.entregador;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class EntregadorService {

    private final EntregadorRepository entregadorRepository;

    public Flux<Entregador> listarTodos() { return entregadorRepository.findAll().switchIfEmpty(Flux.empty());}

    public Mono<Entregador> inserirEntregador(Mono<Entregador> entregador) {
        return entregador.flatMap(entregadorRepository::save);
    }

    public Mono<Entregador> atualizar(Mono<Entregador> entregador, String id) {
        return entregador.doOnNext(e->e.setId(id)).
                flatMap(entregadorRepository::save);
    }

    public Mono<Void> delete(String id) {
        return this.entregadorRepository.deleteById(id).switchIfEmpty(Mono.empty());
    }

}
