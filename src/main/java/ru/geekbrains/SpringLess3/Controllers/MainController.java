package ru.geekbrains.SpringLess3.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.geekbrains.SpringLess3.Model.Product;
import ru.geekbrains.SpringLess3.Service.ProductsService;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private ProductsService productsService;

    @GetMapping("/product/all")
    public List<Product> getProductsList(){
        return productsService.getProductsList();
    }

    @GetMapping("/product/change_coast")
    public void changeCoast(@RequestParam Integer id, @RequestParam Integer coast){
        productsService.changeCoast(id, coast);
    }

//    @GetMapping("/product/all")
//    public String allProducts(Model model){
//        model.addAttribute("product", productsService.getProductsList());
//        return "products_page";
//    }
//
//    @GetMapping("/product/{id}")
//    public String findProductById(Model model, @PathVariable  Integer id){
//        Product product = productsService.getProductById(id);
//        model.addAttribute("product",product);
//        return "product_page";
//    }

}
