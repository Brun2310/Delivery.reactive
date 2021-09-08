package com.ifood.deliveryreactive.produto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import com.ifood.deliveryreactive.restaurante.Restaurante;
import lombok.*;

import java.math.BigDecimal;

@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "produto")
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
    @DBRef
    private Restaurante restaurante;

}
