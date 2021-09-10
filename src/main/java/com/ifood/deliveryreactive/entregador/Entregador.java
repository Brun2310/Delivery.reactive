package com.ifood.deliveryreactive.entregador;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ifood.deliveryreactive.util.Endereco;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Entregador {

    @Id //@JsonIgnore
    private String id;
    private String nome;
    private int idade;
    private Endereco endereco;
    private Long telefone;

}
