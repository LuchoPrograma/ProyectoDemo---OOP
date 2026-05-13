package com.example.proyectoDemo.services;

import com.example.proyectoDemo.entities.Base;
import com.example.proyectoDemo.repositories.BaseRepository;

import java.io.Serializable;

public abstract class BaseServiceImpl<E extends Base, ID extends Serializable> implements BaseService<E, ID> {
    protected BaseRepository<E,ID> baseRepository;

    public BaseServiceImpl(BaseRepository<E,ID> baseRepository) {
        this.baseRepository = baseRepository;
    }
}
