package com.ifood.deliveryreactive.cliente;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ifood.deliveryreactive.Endereco;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "cliente")
public class Cliente {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "clienteId")
    private int id;
    private String nome;
    private int idade;
    @OneToOne @JoinColumn(name = "enderecoId", referencedColumnName = "enderecoId")
    private Endereco endereco;
    private Long telefone;


}
