package ru.geekbrains.SpringLess3.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.geekbrains.SpringLess3.Model.Product;
import ru.geekbrains.SpringLess3.Repository.ProductsRepository;

import java.util.List;

@Component
public class ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    public List<Product> getProductsList(){
        return productsRepository.allProducts();
    }

    public Product getProductById(Integer id){
        Product product = productsRepository.getProductById(id);
        return product;
    }

    public void changeCoast(Integer productId, Integer coast){
        Product product = productsRepository.getProductById(productId);
        product.setCoast(product.getCoast() + coast);
    }
}
