package com.ifood.deliveryreactive.restaurante;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ifood.deliveryreactive.produto.Produto;
import com.ifood.deliveryreactive.util.Endereco;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Restaurante {

    @Id //@JsonIgnore
    private String id;
    private String nome;
    private Endereco endereco;
    private int telefone;

    //@JsonIgnore @DBRef
    private List<Produto> produto;

}
