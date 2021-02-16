package com.credibanco.Repository;
import com.credibanco.Entidades.Autor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IRepositoryAutor extends CrudRepository<Autor, Integer> {
    List<Autor> findAll();
}
