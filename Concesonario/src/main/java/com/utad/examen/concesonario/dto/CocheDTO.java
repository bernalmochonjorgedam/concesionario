package com.utad.examen.concesonario.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CocheDTO {
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
