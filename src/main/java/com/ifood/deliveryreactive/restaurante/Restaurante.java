package com.ifood.deliveryreactive.restaurante;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ifood.deliveryreactive.Endereco;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Restaurante {

    @Id @JsonIgnore
    private int restauranteId;

    @NotNull
    private String nome;

    @OneToOne @JoinColumn(name = "enderecoId", referencedColumnName = "enderecoId")
    private Endereco endereco;

    @NotNull
    private int telefone;

    public Restaurante(String nome, Endereco endereco, int telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

}
