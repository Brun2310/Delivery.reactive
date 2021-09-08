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
@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "pedido")
public class Pedido {

    @Id @JsonIgnore
    //@Column(name = "pedidoId")
    private int id;
    @DBRef
    //@OneToMany @JoinColumn(name = "produtoId", referencedColumnName = "produtoId")
    private List<Produto> produto;
    @DBRef
    //@OneToOne @JoinColumn(name = "entregadorId", referencedColumnName = "entregadorId")
    private Entregador entregador;

}
