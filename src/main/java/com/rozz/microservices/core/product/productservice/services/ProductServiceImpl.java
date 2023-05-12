package com.rozz.microservices.core.product.productservice.services;

import com.rozz.microservices.core.product.productservice.exceptions.InvalidInputException;
import com.rozz.microservices.core.product.productservice.exceptions.NotFoundException;
import com.rozz.microservices.core.product.productservice.product.Product;
import com.rozz.microservices.core.product.productservice.util.ServiceUtil;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductServiceImpl implements ProductService{

    private static final Logger LOG = LoggerFactory.getLogger(ProductServiceImpl.class);

    private final ServiceUtil serviceUtil;



    public ProductServiceImpl (ServiceUtil serviceUtil) {
        this.serviceUtil = serviceUtil;
    }

    @Override
    public Product getProduct(int productId) {
        LOG.debug("/product return the found product for productId={}", productId);

        if (productId < 1) {
            throw new InvalidInputException("Invalid productId: " + productId);
        }

        if (productId == 13) {
            throw new NotFoundException("No product found for productId: " + productId);
        }
        return new Product(productId, "name-" + productId, 123, serviceUtil.getServiceAddress());
    }
}
