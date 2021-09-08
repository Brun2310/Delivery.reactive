package com.ifood.deliveryreactive.cliente;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ifood.deliveryreactive.Endereco;
import com.ifood.deliveryreactive.pedido.Pedido;
import lombok.*;
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
public class Cliente {

    @Id @JsonIgnore
    private int id;
    private String nome;
    private int idade;
    @DBRef
//    @OneToOne @JoinColumn(name = "enderecoId", referencedColumnName = "enderecoId")
    private Endereco endereco;
    private int telefone;
    @DBRef
//    @OneToMany @JoinColumn(name = "pedidoId", referencedColumnName = "pedidoId")
    private List<Pedido> pedidos;


}
