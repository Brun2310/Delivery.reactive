package com.ifood.deliveryreactive.util;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Builder
@Document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Table(name = "endereço")
public class Endereco {

    @Id @JsonIgnore
    //@Column(name = "enderecoId")
    private String idEndereco;

    @NotNull
    private int cep;

    @NotNull
    private int numero;

    @NotNull
    private String complemento;


}
