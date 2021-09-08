package com.ifood.deliveryreactive.pedido;

import com.fasterxml.jackson.annotation.JsonIgnore;

import com.ifood.deliveryreactive.cliente.Cliente;
import com.ifood.deliveryreactive.entregador.Entregador;
import com.ifood.deliveryreactive.produto.Produto;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pedido")
public class Pedido {

    @Id @JsonIgnore
    @Column(name = "pedidoId")
    private int id;
    @OneToMany @JoinColumn(name = "produtoId", referencedColumnName = "produtoId")
    private List<Produto> produto;
    @OneToOne @JoinColumn(name = "entregadorId", referencedColumnName = "entregadorId")
    private Entregador entregador;

}
