package com.ifood.deliveryreactive.produto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import com.ifood.deliveryreactive.restaurante.Restaurante;

import java.math.BigDecimal;

public class Produto {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "produtoId")
    private int id;
    private String nomePrato;
    private BigDecimal preco;
    private int vendas;
    private String descricao;
    @ManyToOne @JoinColumn(name = "restauranteId", referencedColumnName = "restauranteId")
    private Restaurante restaurante;

}
