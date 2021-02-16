package com.credibanco.Mapper;

import com.credibanco.DTOs.DTOBook;
import com.credibanco.Entidades.Libro;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import java.util.List;

@Mapper(componentModel = "spring", uses = {MapperAuthor.class, MapperEditorial.class})
public interface MapperBook {
    @Mappings({
            @Mapping(source = "idLibro", target = "idBook"),
            @Mapping(source = "titulo", target = "title"),
            @Mapping(source = "anio", target = "year"),
            @Mapping(source = "genero", target = "gender"),
            @Mapping(source = "numeroPaginas", target = "numPages"),
            @Mapping(source = "idAutor", target = "idAuthorBook"),
            @Mapping(source = "idEditorial", target = "idEditorialBook"),
            @Mapping(source = "autorLibro", target = "authorBook"),
            @Mapping(source = "editorialLibro", target = "editorialBook")
    })
    DTOBook aDTOBook(Libro libro);

    List<DTOBook> aListDTOBook(List<Libro> listaLibros);

    @InheritInverseConfiguration
    Libro aLibro(DTOBook dtoLibro);
}
