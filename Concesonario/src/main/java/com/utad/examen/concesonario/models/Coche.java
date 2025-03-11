package com.utad.examen.concesonario.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "coches")
public class Coche {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String plateNumber;
    @Column(nullable = false)
    private String brand;
    @Column(nullable = false)
    private Integer year;
    @Column(nullable = false)
    private String model;
    @Column(nullable = false, columnDefinition = "true")
    private Boolean available;
    @Column(nullable = false)
    private String jorge;
}
