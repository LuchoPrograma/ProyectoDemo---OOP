package com.example.proyectoDemo.services;

import com.example.proyectoDemo.entities.Persona;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long > {
    List<Persona> search(String filtro) throws Exception;
}
