package com.example.crud_vinateria.product;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

import com.example.crud_vinateria.supplier.Supplier;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private Long idProduct;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_supplier", referencedColumnName = "id_supplier", nullable = false)
    private Supplier supplier;

    @Column(name = "full_name", nullable = false, length = 100)
    private String fullName;

    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name = "category", length = 50)
    private String category;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

}
