package com.sda.javaee9spring.homework.product;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<ProductEntity> readAllProductEntities() {
        log.info("trying to read all product entities");

        var result = productRepository.findAll();
        log.info("product entities read from db: [{}]", result);

        return result;
    }
    public ProductEntity findProductEntityById(Long id){
        log.info("trying to read product entity by id: [{}]", id);

        Optional<ProductEntity> maybeProduct =  productRepository.findById(id);

        ProductEntity result = null;
        if (maybeProduct.isPresent()){
            result = maybeProduct.get();
        }
        log.info("found product entity: [{}]", result);
        return result;
    }
    public List<ProductEntity> addVAT(){
        var result = productRepository.findAll();

        for (ProductEntity p: result){
            double price = p.getPrice();
            double priceWithVAT = price + ((price/100) * 23);
            p.setPrice(priceWithVAT);
        }
        return result;
    }
}
