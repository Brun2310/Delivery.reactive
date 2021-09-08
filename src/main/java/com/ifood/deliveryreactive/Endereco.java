package com.ifood.deliveryreactive;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Builder
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "endereço")
public class Endereco {

    @Id @JsonIgnore
    @Column(name = "enderecoId")
    private String id;

    @NotNull
    private int cep;

    @NotNull
    private int numero;

    @NotNull
    private String complemento;

}
