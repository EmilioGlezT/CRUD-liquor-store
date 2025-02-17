package com.example.crud_vinateria.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud_vinateria.supplier.Supplier;
import com.example.crud_vinateria.supplier.SupplierRepository;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private SupplierRepository supplierRepository;


    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product) {
        Supplier supplier = supplierRepository.findById(product.getSupplier().getId())
        .orElseThrow(() -> new RuntimeException("Supplier not found"));

        product.setSupplier(supplier);
        return productRepository.save(product);
    }

     

}
