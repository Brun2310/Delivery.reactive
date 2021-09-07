package com.ifood.deliveryreactive;

public class Entregador {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "entregadorId")
    private int id;
    private String nome;
    private int idade;
    @OneToOne @JoinColumn(name = "enderecoId", referencedColumnName = "enderecoId")
    private Endereco endereco;
    private Long telefone;

}
