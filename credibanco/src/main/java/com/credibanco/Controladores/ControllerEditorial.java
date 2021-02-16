package com.credibanco.Controladores;

import com.credibanco.DTOs.DTOAuthor;
import com.credibanco.DTOs.DTOEditorial;
import com.credibanco.Servicios.ServicioDTOEditorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/editorial")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET}, maxAge = 7200)
public class ControllerEditorial {
    @Autowired
    private ServicioDTOEditorial servicioDTOEditorial;

    @GetMapping("/getAll")
    public ResponseEntity<List<DTOEditorial>> getAll(){
        return new ResponseEntity<>(servicioDTOEditorial.getAll(), HttpStatus.OK);
    }

    @PostMapping("save")
    public ResponseEntity<DTOEditorial> save(@RequestBody DTOEditorial dtoEditorial){
        return new ResponseEntity<>(servicioDTOEditorial.save(dtoEditorial), HttpStatus.CREATED);
    }
}
