package com.example.crud_vinateria.client;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cliente")
public class Client {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "idCliente")
    private Long idCliente;

    @Column(name = "Nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "RFC", length = 20)
    private String rfc;

    @Column(name = "Direccion", length = 255)
    private String direccion;

    @Column(name = "Correo", length = 100)
    private String correo;
}
