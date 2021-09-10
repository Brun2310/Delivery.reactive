package com.ifood.deliveryreactive.pedido;

import com.fasterxml.jackson.annotation.JsonIgnore;

import com.ifood.deliveryreactive.cliente.Cliente;
import com.ifood.deliveryreactive.entregador.Entregador;
import com.ifood.deliveryreactive.produto.Produto;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Pedido {

    @Id //@JsonIgnore
    private String id;

    //@JsonIgnore @DBRef
    private List<Produto> produto; // Restaurante?

    //@JsonIgnore @DBRef
    private Entregador entregador;

}
