package com.ifood.deliveryreactive.restaurante;

import com.ifood.deliveryreactive.util.Endereco;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import reactor.core.publisher.Mono;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
//public class RestauranteRequest {
//
//    private String nome;
//    private Endereco endereco;
//    private int telefone;
//
//    public Restaurante convert() {
//        return Restaurante.builder()
//                .nome(this.nome)
//                .endereco(Endereco.builder()
//                        .cep(this.endereco.getCep())
//                        .numero(this.endereco.getNumero())
//                        .complemento(this.endereco.getComplemento())
//                        .build())
//                .telefone(this.telefone)
//                .build();
//    }
//}

public class RestauranteRequest {

    private String id;
    private String nome;
    private Endereco endereco;
    private int telefone;

    public Restaurante convert(Mono<Restaurante> restaurante) {
        return Restaurante.builder()
                .nome(this.nome)
                .telefone(this.telefone)
                .endereco(this.endereco)
                .build();
    }
}
