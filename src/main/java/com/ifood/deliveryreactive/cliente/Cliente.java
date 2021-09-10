package com.ifood.deliveryreactive.cliente;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ifood.deliveryreactive.util.Endereco;
import com.ifood.deliveryreactive.pedido.Pedido;
import lombok.*;
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

    @Id //@JsonIgnore
    private String id;
    private String nome;
    private int idade;
    private Endereco endereco;
    private int telefone;

    //@JsonIgnore @DBRef
    private List<Pedido> pedidos;

}
