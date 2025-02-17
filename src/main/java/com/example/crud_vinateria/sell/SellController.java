package com.example.crud_vinateria.sell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud_vinateria.sell.DTO.SellRequestDTO;

@RestController
@RequestMapping("/sell")
public class SellController {
    
    @Autowired
    private SellService sellService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Sell createSell(@RequestBody SellRequestDTO sellRequestDTO) {
        return sellService.createSell(sellRequestDTO);
    }
}
