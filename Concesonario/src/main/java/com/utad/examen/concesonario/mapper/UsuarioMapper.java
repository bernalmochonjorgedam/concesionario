package com.utad.examen.concesonario.mapper;

import com.utad.examen.concesonario.dto.UsuarioDTO;
import com.utad.examen.concesonario.models.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioMapper {
    public UsuarioDTO toDTO(Usuario usuario) {
        return new UsuarioDTO(
            usuario.getId(),
                usuario.getUsername(),
                usuario.getEmail(),
                usuario.getLicenseNumber(),
                usuario.getJmbYear(),
                usuario.getJmbGender()
        );
    }

    public Usuario toEntity(UsuarioDTO dto) {
        Usuario usuario = new Usuario();
        usuario.setId(dto.getId());
        usuario.setUsername(dto.getUsername());
        usuario.setEmail(dto.getEmail());
        usuario.setLicenseNumber(dto.getLicenseNumber());
        usuario.setJmbYear(dto.getJmbYear());
        return usuario;
    }
}
