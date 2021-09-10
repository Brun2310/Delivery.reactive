package com.ifood.deliveryreactive.produto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import com.ifood.deliveryreactive.restaurante.Restaurante;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Produto {

    @Id //@JsonIgnore
    private String id;

    private String nomePrato;

    private BigDecimal preco;

    @JsonIgnore
    private int vendas;

    private String descricao;

    //@JsonIgnore @DBRef
    private Restaurante restaurante;

}
