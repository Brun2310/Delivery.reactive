package com.ifood.deliveryreactive.entregador;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ifood.deliveryreactive.util.Endereco;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Builder
@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Entregador {

    @Id @JsonIgnore
    private String id;

    @NotNull
    private String nome;

    @NotNull
    private int idade;

    @NotNull
    private Endereco endereco;

    @NotNull
    private Long telefone;

}
