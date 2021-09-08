package com.ifood.deliveryreactive;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Builder
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "endereço")
public class Endereco {
    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "enderecoId")
    private int id;
    private Long cep;
    private int numero;
    private String complemento;

}
