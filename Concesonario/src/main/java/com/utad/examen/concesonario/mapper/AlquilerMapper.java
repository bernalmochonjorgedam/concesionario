package com.utad.examen.concesonario.mapper;

import com.utad.examen.concesonario.dto.AlquilerDTO;
import com.utad.examen.concesonario.models.Alquiler;
import org.springframework.stereotype.Component;

@Component
public class AlquilerMapper {
    public AlquilerDTO toDTO(Alquiler alquiler) {
        return new AlquilerDTO(
            alquiler.getId(),
                alquiler.getUsuarioId(),
                alquiler.getCocheId(),
                alquiler.getRentalDate(),
                alquiler.getReturnDate(),
                alquiler.getJorgePrecio(),
                alquiler.getJorgeMascotas()
        );
    }

    public Alquiler toEntity(AlquilerDTO dto) {
        Alquiler alquiler = new Alquiler();
        return alquiler;
    }
}