package com.credibanco.Mapper;

import com.credibanco.DTOs.DTOAuthor;
import com.credibanco.Entidades.Autor;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import java.util.List;

@Mapper(componentModel = "spring")
public interface MapperAuthor {
    @Mappings({
            @Mapping(source = "idAutor", target = "idAuthor"),
            @Mapping(source = "nombre", target = "nameAuthor"),
            @Mapping(source = "fechaNacimiento", target = "birthDate"),
            @Mapping(source = "ciudadProcedencia", target = "cityOrigin"),
            @Mapping(source = "correoElectronico", target = "emailAuthor")
    })
    DTOAuthor aDTOAuthor(Autor autor);

    List<DTOAuthor> aListDTOAuthor(List<Autor> listaAutores);

    @InheritInverseConfiguration
    @Mapping(target = "listaLibrosAutor", ignore = true)
    Autor aAutor(DTOAuthor dtoAuthor);
}
