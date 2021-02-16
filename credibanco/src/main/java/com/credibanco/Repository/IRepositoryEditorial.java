package com.credibanco.Repository;

import com.credibanco.Entidades.Editorial;
import com.credibanco.Entidades.Libro;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IRepositoryEditorial extends CrudRepository<Editorial, Integer> {
    List<Editorial> findAll();
    Editorial findByIdEditorial(Long idEditorial);
}
