package com.example.crud_vinateria.sell.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductQuantityDTO {
    private Long idProduct;
    private Integer quantity;


}