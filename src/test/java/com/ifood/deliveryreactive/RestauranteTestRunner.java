/*package com.ifood.deliveryreactive;

import com.ifood.deliveryreactive.restaurante.Restaurante;
import com.ifood.deliveryreactive.restaurante.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class RestauranteTestRunner implements CommandLineRunner {

    @Autowired
    private RestauranteRepository restauranteRepository;

    @Override
    public void run(String... args) throws Exception {

        restauranteRepository.deleteAll();

        restauranteRepository.saveAll(Arrays.asList(
                new Restaurante("Domino's", Endereco.builder()
                        .cep(14404678)
                        .numero(3478)
                        .build(), 992263278),
                new Restaurante("Burguer King", Endereco.builder()
                        .cep(12406678)
                        .numero(1278)
                        .complemento("segundo andar ap 4")
                        .build(), 992789078),
                new Restaurante("Madero", Endereco.builder()
                        .cep(14478978)
                        .numero(3245)
                        .complemento("terceiro andar nº 90")
                        .build(), 954263278),
                new Restaurante("Delicias brasileiras", Endereco.builder()
                        .cep(14423676)
                        .numero(3198)
                        .build(), 992163158)
        ));
        System.out.println("All Data saved into MongoDB");

        List<Restaurante> restauranteFlux =  restauranteRepository.findAll().collectList().block();
        assert restauranteFlux != null;
        restauranteFlux.forEach(System.out::println);
    }
} */
