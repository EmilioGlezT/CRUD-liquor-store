package com.example.crud_vinateria.sell;

import com.example.crud_vinateria.product.Product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "detail_sell")
public class DetailSell {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detailSell")
    private Long idDetailSell;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product", referencedColumnName = "id_product", nullable = false)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_sell", referencedColumnName = "id_sell", nullable = false)
    private Sell sell;

}
