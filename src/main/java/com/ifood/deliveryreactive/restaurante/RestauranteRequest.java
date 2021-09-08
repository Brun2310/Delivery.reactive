package com.ifood.deliveryreactive.restaurante;

import com.ifood.deliveryreactive.Endereco;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestauranteRequest {

    private String nome;
    private Long cep;
    private int numero;
    private String complemento;
    private Long telefone;

    public Restaurante convert() {
        return Restaurante.builder()
                .nome(this.nome)
                .endereco(Endereco.builder()
                        .cep(this.cep)
                        .numero(this.numero)
                        .complemento(this.complemento)
                        .build())
                .telefone(this.telefone)
                .build();
    }
}
