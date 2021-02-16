package com.credibanco.Entidades;

import com.sun.istack.NotNull;
import javax.persistence.*;

@Entity
@Table(name="LIBRO")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LIBRO_SEQUENCE")
    @SequenceGenerator(name="LIBRO_SEQUENCE", sequenceName = "SEQPK_LIBRO", allocationSize = 1)
    @Column(name = "ID_LIBRO")
    private Long idLibro;

    @NotNull
    @Column(name = "TITULO")
    private String titulo;

    @Column(name = "ANIO")
    private Long anio;

    @NotNull
    @Column(name = "GENERO")
    private String genero;

    @NotNull
    @Column(name = "NUMERO_PAGINAS")
    private Long numeroPaginas;

    @NotNull
    @Column(name = "ID_AUTOR")
    private Long idAutor;

    @NotNull
    @Column(name = "ID_EDITORIAL")
    private Long idEditorial;

    @ManyToOne
    @JoinColumn(name = "ID_AUTOR", insertable = false, updatable = false)
    private Autor autorLibro;

    @ManyToOne
    @JoinColumn(name = "ID_EDITORIAL", insertable = false, updatable = false)
    private Editorial editorialLibro;

    public Long getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Long idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getAnio() {
        return anio;
    }

    public void setAnio(Long anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Long getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Long numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public Long getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Long idAutor) {
        this.idAutor = idAutor;
    }

    public Long getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(Long idEditorial) {
        this.idEditorial = idEditorial;
    }

    public Autor getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(Autor autorLibro) {
        this.autorLibro = autorLibro;
    }

    public Editorial getEditorialLibro() {
        return editorialLibro;
    }

    public void setEditorialLibro(Editorial editorialLibro) {
        this.editorialLibro = editorialLibro;
    }
}
