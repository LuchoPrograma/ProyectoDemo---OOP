package com.example.proyectoDemo.services;

import com.example.proyectoDemo.entities.Localidad;
import com.example.proyectoDemo.repositories.BaseRepository;

import java.util.List;

public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService {

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Localidad> findAll() throws Exception {
        return List.of();
    }

    @Override
    public Localidad findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public Localidad save(Localidad entity) throws Exception {
        return null;
    }

    @Override
    public Localidad update(Long aLong, Localidad entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long aLong) throws Exception {
        return false;
    }
}
