package com.ifood.deliveryreactive.restaurante;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ifood.deliveryreactive.Endereco;
import com.ifood.deliveryreactive.produto.Produto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.List;

@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "restaurante")
public class Restaurante {

    @Id @JsonIgnore
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "restauranteId")
    private int id;
    private String nome;
    @OneToOne @JoinColumn(name = "enderecoId", referencedColumnName = "enderecoId")
    private Endereco endereco;
    private Long telefone;
    //@OneToMany @JoinColumn(name = "produtoId", referencedColumnName = "produtoId")
    //private List<Produto> produto;

}
