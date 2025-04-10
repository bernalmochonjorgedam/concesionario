package com.utad.examen.concesonario.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {
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
