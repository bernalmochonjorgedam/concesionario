package com.utad.examen.concesonario.dto;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class AlquilerDTO {
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
