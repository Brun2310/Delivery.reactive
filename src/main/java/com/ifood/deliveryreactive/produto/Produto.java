package com.ifood.deliveryreactive.produto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import com.ifood.deliveryreactive.restaurante.Restaurante;

public class Produto {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "produtoId")
    private int id;
    private String nomePrato;
    @OneToOne @JoinColumn(name = "restauranteid", referencedColumnName = "restauranteId")
    private Restaurante restaurante;
    private String descricao;

}
