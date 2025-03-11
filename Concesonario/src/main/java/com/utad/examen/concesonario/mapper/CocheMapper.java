package com.utad.examen.concesonario.mapper;

import com.utad.examen.concesonario.dto.CocheDTO;
import com.utad.examen.concesonario.models.Coche;
import org.springframework.stereotype.Component;

@Component
public class CocheMapper {
    public CocheDTO toDTO(Coche coche) {
        return new CocheDTO(
            coche.getId(),
                coche.getPlateNumber(),
                coche.getBrand(),
                coche.getYear(),
                coche.getModel(),
                coche.getAvailable(),
                coche.getJorge()
        );
    }

    public Coche toEntity(CocheDTO dto) {
        Coche coche = new Coche();
        return coche;
    }
}