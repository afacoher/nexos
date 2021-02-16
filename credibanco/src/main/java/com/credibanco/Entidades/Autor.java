package com.credibanco.Entidades;

import com.sun.istack.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="AUTOR")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AUTOR_SEQUENCE")
    @SequenceGenerator(name="AUTOR_SEQUENCE", sequenceName = "SEQPK_AUTOR", allocationSize = 1)
    @Column(name = "ID_AUTOR")
    private Long idAutor;

    @NotNull
    @Column(name = "NOMBRE_AUTOR")
    private String nombre;

    @Column(name = "FECHA_NACIMIENTO")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date fechaNacimiento;

    @Column(name = "CIUDAD_PROCEDENCIA")
    private String ciudadProcedencia;

    @Column(name = "CORREO_ELECTRONICO")
    private String correoElectronico;

    @OneToMany(mappedBy = "autorLibro")
    private List<Libro> listaLibrosAutor;

    public Long getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Long idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCiudadProcedencia() {
        return ciudadProcedencia;
    }

    public void setCiudadProcedencia(String ciudadProcedencia) {
        this.ciudadProcedencia = ciudadProcedencia;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public List<Libro> getListaLibrosAutor() {
        return listaLibrosAutor;
    }

    public void setListaLibrosAutor(List<Libro> listaLibrosAutor) {
        this.listaLibrosAutor = listaLibrosAutor;
    }
}
