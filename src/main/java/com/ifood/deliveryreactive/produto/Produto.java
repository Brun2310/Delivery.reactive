package com.ifood.deliveryreactive;

public class Produto {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "produtoId")
    private int id;
    private String nomePrato;
    @OneToOne @JoinColumn(name = "restauranteid", referencedColumnName = "restauranteId")
    // Varios restaurantes com mesmo produto?
    private Restaurante restaurante;
    private String descricao;

}

//cachorro quente gabriel 1
//cachorro quente bruno 2