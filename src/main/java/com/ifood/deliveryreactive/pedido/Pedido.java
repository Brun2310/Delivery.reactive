package com.ifood.deliveryreactive;

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
