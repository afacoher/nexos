package com.credibanco.Repository;

import com.credibanco.DTOs.DTOEditorial;
import com.credibanco.DTOs.DTORepositoryEditorial;
import com.credibanco.Entidades.Editorial;
import com.credibanco.Mapper.MapperEditorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class RepositoryEditorial implements DTORepositoryEditorial {
    @Autowired
    private IRepositoryEditorial repositoryEditorial;

    @Autowired
    private MapperEditorial mapperEditorial;

    @Override
    public List<DTOEditorial> getAll(){
        List<Editorial> editorialList = (List<Editorial>)repositoryEditorial.findAll();
        return mapperEditorial.aListDTOEditorial(editorialList);
    }

    @Override
    public DTOEditorial getAllByIDEditorial(Long idEditorial) {
        Editorial editorial = repositoryEditorial.findByIdEditorial(idEditorial);
        return mapperEditorial.aDTOEditorial(editorial);
    }

    @Override
    public DTOEditorial save (DTOEditorial dtoEditorial){
        Editorial editorial = mapperEditorial.aEditorial(dtoEditorial);
        return mapperEditorial.aDTOEditorial(repositoryEditorial.save(editorial));
    }
}
