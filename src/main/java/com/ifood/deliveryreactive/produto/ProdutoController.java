package com.ifood.deliveryreactive.produto;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/produto")
public class ProdutoController {

    private final ProdutoService produtoService;

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping
    public Flux<Produto> listarTodos() { return produtoService.listarTodos(); }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PostMapping()
    public Mono<Produto> inserirProduto(@RequestBody Produto produto) {
        return  produtoService.inserirProduto(produto);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @PatchMapping("/{id}")
    public Mono<Produto> atualizarProduto(@RequestBody Produto produto,
                                                  @PathVariable String id) {
        return produtoService.atualizar(produto,id);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @DeleteMapping("/{id}")
    public Mono<Void> deletarProduto(@PathVariable String id) {
        return produtoService.delete(id);
    }

}
