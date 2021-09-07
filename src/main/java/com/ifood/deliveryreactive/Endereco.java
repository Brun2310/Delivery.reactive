package com.ifood.deliveryreactive;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "endereço")
public class Endereco {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "enderecoId")
    private int id;
    private Long cep;
    private Long numero;
    private String complemento;

}
