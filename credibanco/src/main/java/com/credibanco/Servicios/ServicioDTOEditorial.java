package com.credibanco.Servicios;

import com.credibanco.DTOs.DTOBook;
import com.credibanco.DTOs.DTOEditorial;
import com.credibanco.DTOs.DTORepositoryEditorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioDTOEditorial {
    @Autowired
    private DTORepositoryEditorial dtoRepositoryEditorial;

    public List<DTOEditorial> getAll(){
        return dtoRepositoryEditorial.getAll();
    }

    public DTOEditorial getAllByIDEditorial(Long idEditorial){
        return dtoRepositoryEditorial.getAllByIDEditorial(idEditorial);
    }

    public DTOEditorial save(DTOEditorial dtoEditorial){
        return dtoRepositoryEditorial.save(dtoEditorial);
    }
}
