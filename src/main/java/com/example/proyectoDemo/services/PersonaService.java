package com.example.proyectoDemo.services;

import com.example.proyectoDemo.entities.Persona;

import java.util.List;

public class PersonaService implements BaseService<Persona> {
    @Override
    public List<Persona> findAll() throws Exception {
        return List.of();
    }

    @Override
    public Persona findById(Long id) throws Exception {
        return null;
    }

    @Override
    public Persona save(Persona entity) throws Exception {
        return null;
    }

    @Override
    public Persona update(Persona entity) throws Exception {
        return null;
    }

    @Override
    public boolean delete(Long id) throws Exception {
        return false;
    }
}
