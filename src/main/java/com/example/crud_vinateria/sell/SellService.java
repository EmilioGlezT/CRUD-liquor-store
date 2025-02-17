package com.example.crud_vinateria.sell;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud_vinateria.client.Client;
import com.example.crud_vinateria.client.ClientRepository;
import com.example.crud_vinateria.employee.Employee;
import com.example.crud_vinateria.employee.EmployeeRepository;
import com.example.crud_vinateria.product.Product;
import com.example.crud_vinateria.product.ProductRepository;
import com.example.crud_vinateria.sell.DTO.*;

import jakarta.transaction.Transactional;

@Service
public class SellService {
    
    @Autowired
    private SellRepository sellRepository;

    @Autowired
    private DetailSellRepository detailSellRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ClientRepository clientRepository;
    
    @Transactional
    public Sell createSell(SellRequestDTO sellRequestDTO) {
        Employee employee = employeeRepository.findById(sellRequestDTO.getIdEmployee()).orElseThrow(() -> new RuntimeException("Empleado no encontrado"));
        Client client = clientRepository.findById(sellRequestDTO.getIdClient()).orElseThrow(() -> new RuntimeException("Cliente no encontrado"));

        Sell sell = new Sell();
        sell.setEmployee(employee);
        sell.setClient(client);
        sell.setSellDate(LocalDateTime.now());
        sell.setTotal(BigDecimal.ZERO); // Inicializar el total

        sell = sellRepository.save(sell);

        for (ProductQuantityDTO productDTO : sellRequestDTO.getProducts()) {
            Product product = productRepository.findById(productDTO.getIdProduct()).orElseThrow(() -> new RuntimeException("Producto no encontrado"));

            DetailSell detailSell = new DetailSell();
            detailSell.setSell(sell);
            detailSell.setProduct(product);

            BigDecimal productTotal = product.getPrice().multiply(BigDecimal.valueOf(productDTO.getQuantity()));
            sell.setTotal(sell.getTotal().add(productTotal));

            detailSellRepository.save(detailSell);
        }

        sellRepository.save(sell);

        return sell;
    }
}
