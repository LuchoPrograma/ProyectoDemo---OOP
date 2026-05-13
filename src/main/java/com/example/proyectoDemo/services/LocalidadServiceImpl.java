package com.example.proyectoDemo.services;

import com.example.proyectoDemo.entities.Localidad;
import com.example.proyectoDemo.repositories.BaseRepository;
import com.example.proyectoDemo.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService {

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
