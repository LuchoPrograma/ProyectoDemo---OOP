package com.example.proyectoDemo.services;

import com.example.proyectoDemo.entities.Base;
import com.example.proyectoDemo.repositories.BaseRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;

public abstract class BaseServiceImpl<E extends Base, ID extends Serializable> implements BaseService<E, ID> {
    protected BaseRepository<E,ID> baseRepository;

    public BaseServiceImpl(BaseRepository<E,ID> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Transactional
    @Override
    public Page<E> findAll(Pageable pageable) throws Exception{

        try{
            Page<E> entities = baseRepository.findAll(pageable);
            return entities;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
