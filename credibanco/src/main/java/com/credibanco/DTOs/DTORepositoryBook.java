package com.credibanco.DTOs;

import com.credibanco.DTOs.DTOBook;

import java.util.List;

public interface DTORepositoryBook {
    List<DTOBook> getAll();
    List<DTOBook> getAllByIDAuthor(Long idAuthor);
    List<DTOBook> getAllByIDEditorial(Long idEditorial);
    List<DTOBook> getAllByTitle(String title);
    List<DTOBook> getAllByYear(Long year);
    DTOBook save(DTOBook dtoBook);
}
