package com.ifood.deliveryreactive.pedido;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ifood.deliveryreactive.Entregador;
import com.ifood.deliveryreactive.cliente.Cliente;
import com.ifood.deliveryreactive.produto.Produto;

import javax.persistence.*;
import java.util.List;

public class Pedido {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "pedidoId")
    private int id;
    @OneToMany @JoinColumn(name = "produtoId", referencedColumnName = "produtoId")
    private List<Produto> produto;
    @OneToOne @JoinColumn(name = "entregadorId", referencedColumnName = "entregadorId")
    private Entregador entregador;
    @OneToOne @JoinColumn(name = "clienteId", referencedColumnName = "clienteId")
    private Cliente cliente;

}