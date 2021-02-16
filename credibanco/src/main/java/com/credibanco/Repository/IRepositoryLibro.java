package com.credibanco.Repository;

import com.credibanco.Entidades.Libro;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IRepositoryLibro extends CrudRepository<Libro, Integer> {
    List<Libro> findAll();
    List<Libro> findByIdAutor(Long idAutor);
    List<Libro> findByIdEditorial(Long idEditorial);
    List<Libro> findByTitulo(String titulo);
    List<Libro> findByAnio(Long anio);
    Libro save(Libro libro);
}
