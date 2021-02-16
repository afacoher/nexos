package com.credibanco.Controladores;

import com.credibanco.DTOs.DTOAuthor;
import com.credibanco.Servicios.ServicioDTOAuthor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class ControllerAuthor {
    @Autowired
    private ServicioDTOAuthor servicioDTOAuthor;

    @GetMapping("/getAll")
    public ResponseEntity<List<DTOAuthor>> getAll(){
        return new ResponseEntity<>(servicioDTOAuthor.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<DTOAuthor> save(@RequestBody DTOAuthor dtoAuthor){
        return new ResponseEntity<>(servicioDTOAuthor.save(dtoAuthor), HttpStatus.CREATED);
    }
}
