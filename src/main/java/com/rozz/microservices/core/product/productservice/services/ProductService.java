package com.rozz.microservices.core.product.productservice.services;

import com.rozz.microservices.core.product.productservice.product.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductService {
    @GetMapping(
            value = "/product/{productId}",
            produces = "application/json")
    Product getProduct(@PathVariable int productId);
}
