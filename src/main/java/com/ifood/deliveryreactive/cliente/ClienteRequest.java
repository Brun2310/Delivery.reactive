package com.ifood.deliveryreactive.cliente;

import com.ifood.deliveryreactive.Endereco;

public class ClienteRequest {

    private String nome;
    private int idade;
    private int cep;
    private int numero;
    private String complemento;
    private int telefone;

    public Cliente convert() {
        return Cliente.builder()
                .nome(this.nome)
                .idade(this.idade)
                .endereco(Endereco.builder()
                        .cep(this.cep)
                        .numero(this.numero)
                        .complemento(this.complemento)
                        .build())
                .telefone(this.telefone)
                .build();
    }
}
