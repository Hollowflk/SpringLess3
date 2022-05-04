package ru.geekbrains.SpringLess3.Repository;

import org.springframework.stereotype.Component;
import ru.geekbrains.SpringLess3.Model.Product;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class ProductsRepository implements Repository {

    private List<Product> productList;

    @PostConstruct
    public void init(){
        productList = new ArrayList<>(Arrays.asList(
           new Product(1,"Bread",50),
           new Product(2,"Milk",89),
           new Product(3,"Cheese",200),
           new Product(4,"Tea",79),
           new Product(5,"Meat",279)
        ));
    }

    @Override
    public List<Product> allProducts() {
        return productList;
    }

    @Override
    public Product getProductById(Integer id) {
        return productList.stream().filter(n -> n.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }
}
