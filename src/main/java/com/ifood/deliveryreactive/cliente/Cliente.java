package com.ifood.deliveryreactive.cliente;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ifood.deliveryreactive.util.Endereco;
import com.ifood.deliveryreactive.pedido.Pedido;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Cliente {

    @Id @JsonIgnore
    private String id;

    @NotNull
    private String nome;

    @NotNull
    private int idade;

    @NotNull
    private Endereco endereco;

    @NotNull
    private int telefone;

    @JsonIgnore
    private List<Pedido> pedidos;

}
