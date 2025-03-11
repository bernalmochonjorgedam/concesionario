package com.utad.examen.concesonario.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique=true)
    private String username;
    @Column(nullable = false, unique=true)
    private String email;
    @Column(nullable = false, unique=true)
    private String licenseNumber;
    @Column(nullable = false, unique=true)
    private Integer jmbYear;
    @Column(nullable = false, unique=true)
    private Boolean jmbGender;
}
