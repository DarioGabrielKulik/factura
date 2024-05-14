package com.factura.factura;

import com.factura.factura.models.Item;
import com.factura.factura.models.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:text.properties")
public class AllConfigurations {

    @Bean
    @Primary
    List<Item> items(){
        Product p1= new Product("camara",800);
        Product p2 = new Product("bicicleta",1200);
        Product p3 = new Product("notebook",2000);
        List<Item> list = Arrays.asList(
                new Item(p1,6),
                new Item(p2, 20),
                new Item(p3,13)
        ) ;
        return list;
    }
    @Bean
   // @Primary
    List<Item> itemsOficina(){
        Product p1= new Product("Plays5",80);
        Product p2 = new Product("bar",1200);
        Product p3 = new Product("CPU",2000);
        List<Item> list = Arrays.asList(
                new Item(p1,3),
                new Item(p2, 5),
                new Item(p3,7)
        ) ;
        return list;
    }
}
