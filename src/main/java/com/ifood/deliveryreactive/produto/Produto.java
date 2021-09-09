package com.ifood.deliveryreactive.produto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

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
public class Produto {

    @Id @JsonIgnore
    private String id;

    @NotNull
    private String nomePrato;

    @NotNull
    private BigDecimal preco;

    @JsonIgnore
    private int vendas;

    @NotNull
    private String descricao;

    @NotNull
    private Restaurante restaurante;

}
