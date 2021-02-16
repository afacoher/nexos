package com.credibanco.Servicios;

import com.credibanco.DTOs.DTOAuthor;
import com.credibanco.DTOs.DTORepositoryAuthor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioDTOAuthor {
    @Autowired
    private DTORepositoryAuthor dtoRepositoryAuthor;

    public List<DTOAuthor> getAll(){
        return dtoRepositoryAuthor.getAll();
    }

    public DTOAuthor save(DTOAuthor dtoAuthor){
        return dtoRepositoryAuthor.save(dtoAuthor);
    }
}
