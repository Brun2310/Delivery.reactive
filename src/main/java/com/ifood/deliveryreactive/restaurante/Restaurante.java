package com.ifood.deliveryreactive.restaurante;

import com.ifood.deliveryreactive.util.Endereco;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Restaurante {

    @Id //@JsonIgnore
    private String restauranteId;

    @NotNull()
    private String nome;

    @NotNull
    private Endereco endereco;

    @NotNull
    private int telefone;

    //@JsonIgnore @DBRef
    private List<Produto> produto;

}
