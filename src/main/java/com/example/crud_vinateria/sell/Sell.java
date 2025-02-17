package com.example.crud_vinateria.sell;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.example.crud_vinateria.client.Client;
import com.example.crud_vinateria.employee.Employee;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sell")
public class Sell {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sell")
    private Long idSell;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_employee", referencedColumnName = "id_employee", nullable = false)
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_client", referencedColumnName = "id_client", nullable = false)
    private Client client;

    @Column(name = "sell_date", nullable = false)
    private LocalDateTime sellDate;

    @Column(name = "total", nullable = false, precision = 10, scale = 2)
    private BigDecimal total;

}
