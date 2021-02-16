package com.credibanco.Mapper;

import com.credibanco.DTOs.DTOEditorial;
import com.credibanco.Entidades.Editorial;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import java.util.List;

@Mapper(componentModel = "spring")
public interface MapperEditorial {
    @Mappings({
            @Mapping(source = "idEditorial", target = "idEditorial"),
            @Mapping(source = "nombre", target = "nameEditorial"),
            @Mapping(source = "direccion", target = "address"),
            @Mapping(source = "telefono", target = "phone"),
            @Mapping(source = "correoElectronico", target = "emailEditorial"),
            @Mapping(source = "maxLibros", target = "maxBooks")
    })
    DTOEditorial aDTOEditorial(Editorial editorial);

    List<DTOEditorial> aListDTOEditorial(List<Editorial> listaEditoriales);

    @InheritInverseConfiguration
    @Mapping(target = "listaLibrosEditorial", ignore = true)
    Editorial aEditorial(DTOEditorial dtoEditorial);
}
