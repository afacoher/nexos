package com.credibanco.Servicios;

import com.credibanco.DTOs.DTOBook;
import com.credibanco.DTOs.DTORepositoryBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioDTOBook {
    @Autowired
    private DTORepositoryBook dtoRepositoryBook;

    public List<DTOBook> getAll(){
        return dtoRepositoryBook.getAll();
    }

    public List<DTOBook> getAllByAuthor(Long idAuthor){
        return dtoRepositoryBook.getAllByIDAuthor(idAuthor);
    }

    public List<DTOBook> getAllByIDEditorial(Long idEditorial){
        return dtoRepositoryBook.getAllByIDEditorial(idEditorial);
    }

    public List<DTOBook> getAllByTitle(String title){
        return dtoRepositoryBook.getAllByTitle(title);
    }

    public List<DTOBook> getAllByYear(Long year){
        return dtoRepositoryBook.getAllByYear(year);
    }

    public DTOBook save(DTOBook dtoBook){
        return dtoRepositoryBook.save(dtoBook);
    }
}
