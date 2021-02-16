package com.credibanco.Repository;

import com.credibanco.DTOs.DTOBook;
import com.credibanco.DTOs.DTORepositoryBook;
import com.credibanco.Entidades.Libro;
import com.credibanco.Mapper.MapperBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class RepositoryLibro implements DTORepositoryBook {
    @Autowired
    private IRepositoryLibro repositoryLibro;

    @Autowired
    private MapperBook mapperBook;

    @Override
    public List<DTOBook> getAll(){
        List<Libro> libroList = (List<Libro>) repositoryLibro.findAll();
        return mapperBook.aListDTOBook(libroList);
    }

    @Override
    public List<DTOBook> getAllByIDAuthor(Long idAuthor) {
        List<Libro> libroList = repositoryLibro.findByIdAutor(idAuthor);
        return mapperBook.aListDTOBook(libroList);
    }

    @Override
    public List<DTOBook> getAllByIDEditorial(Long idEditorial) {
        List<Libro> libroList = repositoryLibro.findByIdEditorial(idEditorial);
        return mapperBook.aListDTOBook(libroList);
    }

    @Override
    public List<DTOBook> getAllByTitle(String title) {
        List<Libro> libroList = repositoryLibro.findByTitulo(title);
        return mapperBook.aListDTOBook(libroList);
    }

    @Override
    public List<DTOBook> getAllByYear(Long year) {
        List<Libro> libroList = repositoryLibro.findByAnio(year);
        return mapperBook.aListDTOBook(libroList);
    }

    @Override
    public DTOBook save(DTOBook dtoBook) {
        Libro libro = mapperBook.aLibro(dtoBook);
        return mapperBook.aDTOBook(repositoryLibro.save(libro));
    }
}
