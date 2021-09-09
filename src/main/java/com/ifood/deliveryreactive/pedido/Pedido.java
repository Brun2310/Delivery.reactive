package com.ifood.deliveryreactive.pedido;

import com.fasterxml.jackson.annotation.JsonIgnore;

import com.ifood.deliveryreactive.cliente.Cliente;
import com.ifood.deliveryreactive.entregador.Entregador;
import com.ifood.deliveryreactive.produto.Produto;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Builder
@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {

    @Id @JsonIgnore
    private String id;

    @NotNull
    private List<Produto> produto; // Restaurante?

    @NotNull
    private Entregador entregador;

}
