package com.example.crud_vinateria.employee;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "id_employee")
    private Long id;

    @Column(name = "full_name", nullable = false, length = 100)
    private String name;

    @Column(name = "position_name", nullable = false, length = 100)
    private String position_name;

    @Column(name = "address", length = 255)
    private String address;

    @Column(name = "employee_password", length = 20)
    private String password;

    @Column(name = "email", length = 100)
    private String email;
}
