package com.ifood.deliveryreactive.produto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import com.ifood.deliveryreactive.restaurante.Restaurante;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.math.BigDecimal;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Produto {

    @Id
    private String id;

    private String nomePrato;

    private BigDecimal preco;

    @JsonIgnore
    private int vendas;

    private String descricao;

    //@DBRef -> da erro 500 (sem a anotação ta rodando, mas nao relaciona com restaurante)
    private Restaurante restaurante;

}
