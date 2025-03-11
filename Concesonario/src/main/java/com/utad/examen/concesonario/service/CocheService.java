package com.utad.examen.concesonario.service;

import com.utad.examen.concesonario.dto.CocheDTO;
import com.utad.examen.concesonario.mapper.CocheMapper;
import com.utad.examen.concesonario.models.Coche;
import com.utad.examen.concesonario.repository.CocheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CocheService {
    @Autowired
    private CocheRepository cocheRepository;

    @Autowired
    private CocheMapper cocheMapper;

    public List<CocheDTO> findAll() {
        return cocheRepository.findAll().stream().map(cocheMapper::toDTO).collect(Collectors.toList());
    }
    public CocheDTO createCoche(CocheDTO dto) {
        Coche coche = cocheMapper.toEntity(dto);
        cocheRepository.save(coche);
        return cocheMapper.toDTO(coche);
    }

    public void deleteUsuario(Long id) {
        Coche coche = cocheRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Coche not found"));
        cocheRepository.delete(coche);
    }

}
