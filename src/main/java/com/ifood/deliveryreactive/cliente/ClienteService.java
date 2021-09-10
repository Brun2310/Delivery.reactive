package com.ifood.deliveryreactive.cliente;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public Flux<Cliente> listarTodos() { return  clienteRepository.findAll().switchIfEmpty(Flux.empty());}

    public Mono<Cliente> inserirCliente(Mono<Cliente> cliente) {
        return cliente.flatMap(clienteRepository::save);
    }

    public Mono<Cliente> atualizar(Mono<Cliente> cliente, String id) {
        return cliente.doOnNext(e->e.setId(id)).
                flatMap(clienteRepository::save);
    }

    public Mono<Void> delete(String id) {
        return this.clienteRepository.deleteById(id).switchIfEmpty(Mono.empty());
    }

}
