package com.tienda.entidad;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 75)
    private String name;

    @Column(nullable = false, length = 75)
    private String lastname;

    @Column(unique = true, nullable = false, length = 11)
    private String docnumber;

    @OneToMany(mappedBy = "client")
    private List<Invoice> invoices;

    // Getters y Setters
}
