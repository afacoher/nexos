package com.credibanco.DTOs;

import com.credibanco.DTOs.DTOEditorial;

import java.util.List;

public interface DTORepositoryEditorial {
    List<DTOEditorial> getAll();
    DTOEditorial getAllByIDEditorial(Long idEditorial);
    DTOEditorial save(DTOEditorial dtoEditorial);
}
