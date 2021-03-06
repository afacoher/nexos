package com.credibanco.Controladores;

import com.credibanco.DTOs.DTOBook;
import com.credibanco.DTOs.DTOEditorial;
import com.credibanco.DTOs.DTOResponseBook;
import com.credibanco.Excepciones.ExcepcionesDTOBook;
import com.credibanco.Servicios.ServicioDTOBook;
import com.credibanco.Servicios.ServicioDTOEditorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET}, maxAge = 7200)
public class ControllerBook {
    @Autowired
    private ServicioDTOBook servicioDTOBook;

    @Autowired
    private ServicioDTOEditorial servicioDTOEditorial;

    @GetMapping("/getAll")
    public ResponseEntity<List<DTOBook>> getAll(){
        return new ResponseEntity<>(servicioDTOBook.getAll(), HttpStatus.OK);
    }

    @GetMapping("/getAllByAuthor/{id}")
    public ResponseEntity<List<DTOBook>> getAllByAuthor(@PathVariable("id") Long idAuthor){
        return new ResponseEntity<>(servicioDTOBook.getAllByAuthor(idAuthor), HttpStatus.OK);
    }

    @GetMapping("/getAllByIDEditorial/{id}")
    public ResponseEntity<List<DTOBook>> getAllByIDEditorial(@PathVariable("id")Long idEditorial){
        return new ResponseEntity<>(servicioDTOBook.getAllByIDEditorial(idEditorial), HttpStatus.OK);
    }

    @GetMapping("/getAllByTitle/{title}")
    public ResponseEntity<List<DTOBook>> getAllByTitle(@PathVariable("title")String title){
        return new ResponseEntity<>(servicioDTOBook.getAllByTitle(title), HttpStatus.OK);
    }

    @GetMapping("/getAllByYear/{year}")
    public ResponseEntity<List<DTOBook>> getAllByYear(@PathVariable("year")Long year){
        return new ResponseEntity<>(servicioDTOBook.getAllByYear(year), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<DTOResponseBook> save(@RequestBody DTOBook dtoBook){
        try{
            DTOEditorial dtoEditorial = new DTOEditorial();
            dtoEditorial = servicioDTOEditorial.getAllByIDEditorial(dtoBook.getIdEditorialBook());

            if(servicioDTOBook.getAllByIDEditorial(dtoBook.getIdEditorialBook()).size() < dtoEditorial.getMaxBooks()){
                DTOResponseBook dtoResponseBook = new DTOResponseBook();
                dtoResponseBook.setResponse(servicioDTOBook.save(dtoBook));
                dtoResponseBook.setResponseCode(HttpStatus.CREATED);
                dtoResponseBook.setMessage("Libro creado correctamente");
                return ResponseEntity.ok(dtoResponseBook);
            }else{
                DTOResponseBook dtoResponseBook = new DTOResponseBook();
                dtoResponseBook.setResponse(null);
                dtoResponseBook.setResponseCode(HttpStatus.INTERNAL_SERVER_ERROR);
                dtoResponseBook.setMessage("No es posible registrar el libro. Se alcanzó el máximo permitido");
                return ResponseEntity.ok(dtoResponseBook);
            }
        }catch (Exception e){
            if(e.getMessage().contains("CREDIBANCO.FK_AUTOR")){
                throw new ExcepcionesDTOBook("El autor no esta registrado");
            }else if (e.getMessage().contains("CREDIBANCO.FK_EDITORIAL")){
                throw new ExcepcionesDTOBook("La editorial no esta registrada");
            }else{
                throw new ExcepcionesDTOBook("Error @PostMapping(\"/save\")");
            }
        }
    }
}
