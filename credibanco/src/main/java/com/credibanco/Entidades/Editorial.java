package com.credibanco.Entidades;

import com.sun.istack.NotNull;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="EDITORIAL")
@SequenceGenerator(name="EDITORIAL_SEQUENCE", sequenceName = "SEQPK_EDITORIAL", allocationSize = 1)
public class Editorial {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EDITORIAL_SEQUENCE")
    @SequenceGenerator(name="EDITORIAL_SEQUENCE", sequenceName = "SEQPK_EDITORIAL", allocationSize = 1)
    @Column(name = "ID_EDITORIAL")
    private Long idEditorial;

    @NotNull
    @Column(name = "NOMBRE_EDITORIAL")
    private String nombre;

    @NotNull
    @Column(name = "DIRECCION")
    private String direccion;

    @NotNull
    @Column(name = "TELEFONO")
    private Long telefono;

    @Column(name = "CORREO_ELECTRONICO")
    private String correoElectronico;

    @NotNull
    @Column(name = "MAX_LIBROS")
    private Long maxLibros;

    @OneToMany(mappedBy = "editorialLibro")
    private List<Libro> listaLibrosEditorial;

    public Long getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(Long idEditorial) {
        this.idEditorial = idEditorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Long getMaxLibros() {
        return maxLibros;
    }

    public void setMaxLibros(Long maxLibros) {
        this.maxLibros = maxLibros;
    }

    public List<Libro> getListaLibrosEditorial() {
        return listaLibrosEditorial;
    }

    public void setListaLibrosEditorial(List<Libro> listaLibrosEditorial) {
        this.listaLibrosEditorial = listaLibrosEditorial;
    }
}
