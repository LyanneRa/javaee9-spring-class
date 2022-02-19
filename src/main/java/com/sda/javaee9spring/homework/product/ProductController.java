package com.sda.javaee9spring.homework.product;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/products")
    public List<ProductEntity> findAllProducts(){
        log.info("findAllProducts()");

       return productService.readAllProductEntities();
    }
    @GetMapping("/products/{id}")
    public ProductEntity findProductById(@PathVariable("id") Long productId){
        log.info("trying to find product by id: [{}]", productId);

        return productService.findProductEntityById(productId);
    }
}
