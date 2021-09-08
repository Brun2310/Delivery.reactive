package com.ifood.deliveryreactive.cliente;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public Flux<Cliente> listarTodos() { return  clienteRepository.findAll().switchIfEmpty(Flux.empty());}

    public Mono<Cliente> inserirCliente(ClienteRequest clienteRequest) {
        var cliente  = clienteRequest.convert();
        return clienteRepository.save(cliente);

    }

}
