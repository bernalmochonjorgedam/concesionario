package com.utad.examen.concesonario.service;


import com.utad.examen.concesonario.dto.UsuarioDTO;
import com.utad.examen.concesonario.mapper.UsuarioMapper;
import com.utad.examen.concesonario.models.Usuario;
import com.utad.examen.concesonario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private UsuarioMapper usuarioMapper;

    public List<UsuarioDTO> findAll() {
        return usuarioRepository.findAll().stream().map(usuarioMapper::toDTO).collect(Collectors.toList());
    }
    public UsuarioDTO createUsuario(UsuarioDTO dto) {
        Usuario usuario = usuarioMapper.toEntity(dto);
        usuarioRepository.save(usuario);
        return usuarioMapper.toDTO(usuario);
    }

    public void deleteUsuario(Long id) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario not found"));
        usuarioRepository.delete(usuario);
    }
}
