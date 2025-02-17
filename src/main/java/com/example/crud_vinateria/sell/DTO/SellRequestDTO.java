package com.example.crud_vinateria.sell.DTO;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SellRequestDTO {
    
    private Long idEmployee;
    private Long idClient;
    private List<ProductQuantityDTO> products;

    
}
