package com.example.proyectoDemo.repositories;

import com.example.proyectoDemo.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {

    //Metodo Query - funciona con el propio nombre del metodo pero dificil de mantener
    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);
    //boolean existsByDni(int dni);

//    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%?1%' OR p.apellido LIKE '%?1%'")
//    List<Persona> search1(String filtro);

    //Metodo parametros indexados JPQL
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%:filtro%' OR p.apellido LIKE '%filtro%'")
    List<Persona> search(@Param("filtro") String filtro);

    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%:filtro%' OR p.apellido LIKE '%filtro%'")
    Page<Persona> search(@Param("filtro") String filtro, Pageable pageable);

    //Metodo nativo con JPQL
    @Query(
            value = "SELECT * FROM Persona p WHERE persona.nombre LIKE '%?filtro%' OR persona.apellido LIKE '%?filtro%'",
            nativeQuery = true
    )
    List<Persona> searchNativo(String filtro);

    @Query(
            value = "SELECT * FROM Persona p WHERE persona.nombre LIKE '%?filtro%' OR persona.apellido LIKE '%?filtro%'",
            countQuery = "SELECT count(*) FROM persona",
            nativeQuery = true
    )
    Page<Persona> searchNativo(String filtro, Pageable pageable);
}
