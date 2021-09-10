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
    @PostMapping("/{id}")
    public Mono<Produto> inserirProduto(@RequestBody Mono<Produto> produto,
                                        @PathVariable String id) {
        return  produtoService.inserirProduto(produto,id);
    }

}
