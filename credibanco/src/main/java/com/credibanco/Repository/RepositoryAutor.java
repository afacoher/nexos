package com.credibanco.Repository;

import com.credibanco.DTOs.DTOAuthor;
import com.credibanco.DTOs.DTORepositoryAuthor;
import com.credibanco.Entidades.Autor;
import com.credibanco.Mapper.MapperAuthor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class RepositoryAutor implements DTORepositoryAuthor {
    @Autowired
    private IRepositoryAutor repositoryAutor;

    @Autowired
    private MapperAuthor mapperAuthor;

    @Override
    public List<DTOAuthor> getAll(){
        List<Autor> autorList = (List<Autor>)repositoryAutor.findAll();
        return mapperAuthor.aListDTOAuthor(autorList);
    }

    @Override
    public DTOAuthor save (DTOAuthor dtoAuthor){
        Autor autor = mapperAuthor.aAutor(dtoAuthor);
        return mapperAuthor.aDTOAuthor(repositoryAutor.save(autor));
    }
}
