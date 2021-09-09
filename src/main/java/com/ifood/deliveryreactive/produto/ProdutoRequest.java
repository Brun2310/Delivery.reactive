package com.ifood.deliveryreactive.produto;

import java.math.BigDecimal;

public class ProdutoRequest {

    private String nomePrato;
    private BigDecimal preco;
    private int vendas;
    private String descricao;

    public Produto convert() {
        return Produto.builder()
                .nomePrato(this.nomePrato)
                .preco(this.preco)
                .vendas(this.vendas)
                .descricao(this.descricao)
                .build();
    }
}
