package com.ifood.deliveryreactive.cliente;

import com.ifood.deliveryreactive.util.Endereco;

public class ClienteRequest {

    private String nome;
    private int idade;
    private Endereco endereco;
    private int telefone;

    public Cliente convert() {
        return Cliente.builder()
                .nome(this.nome)
                .idade(this.idade)
                .endereco(Endereco.builder()
                        .cep(this.endereco.getCep())
                        .numero(this.endereco.getNumero())
                        .complemento(this.endereco.getComplemento())
                        .build())
                .telefone(this.telefone)
                .build();
    }
}
