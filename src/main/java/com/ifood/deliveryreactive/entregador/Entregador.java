package com.ifood.deliveryreactive.entregador;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ifood.deliveryreactive.Endereco;
import lombok.*;

import javax.persistence.*;

@Builder
@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "entregador")
public class Entregador {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "entregadorId")
    private int id;
    private String nome;
    private int idade;
    @OneToOne @JoinColumn(name = "enderecoId", referencedColumnName = "enderecoId")
    private Endereco endereco;
    private Long telefone;

}
