package com.ifood.deliveryreactive.produto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import com.ifood.deliveryreactive.restaurante.Restaurante;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Builder
@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "produto")
public class Produto {

    @Id @JsonIgnore
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
