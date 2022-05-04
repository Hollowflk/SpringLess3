package ru.geekbrains.SpringLess3.Repository;

import ru.geekbrains.SpringLess3.Model.Product;

import java.util.List;

public interface Repository {

    List<Product> allProducts();

    Product getProductById(Integer id);
}
