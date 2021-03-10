package ro.ls.springbootsql.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.ls.springbootsql.services.ProductService;


@RestController
@RequestMapping(path = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;


    @PostMapping(path = "/add-one/{name}")
    public void addProduct(@PathVariable String name) {
        productService.addProduct(name);
    }

}