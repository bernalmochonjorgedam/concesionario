package com.utad.examen.concesonario.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "alquileres")
public class Alquiler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private Long usuarioId;
    @Column(nullable = false, unique = true)
    private Long cocheId;
    private LocalDateTime rentalDate;
    @Column(nullable = true)
    private LocalDateTime returnDate ;
    @Column(nullable = false)
    private String jorgePrecio;
    @Column(nullable = false, columnDefinition = "false")
    private Boolean jorgeMascotas;

    enum status  {
        ACTIVE, COMPLETED;
    }
}
