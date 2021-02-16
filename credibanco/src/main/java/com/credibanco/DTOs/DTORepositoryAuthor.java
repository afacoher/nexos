package com.credibanco.DTOs;

import com.credibanco.DTOs.DTOAuthor;

import java.util.List;

public interface DTORepositoryAuthor {
    List<DTOAuthor> getAll();
    DTOAuthor save(DTOAuthor dtoAuthor);
}
