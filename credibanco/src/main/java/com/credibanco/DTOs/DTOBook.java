package com.credibanco.DTOs;

public class DTOBook {
    private Long idBook;
    private String title;
    private Long year;
    private String gender;
    private Long numPages;
    private Long idAuthorBook;
    private Long idEditorialBook;
    private DTOAuthor authorBook;
    private DTOEditorial editorialBook;

    public Long getIdBook() {
        return idBook;
    }

    public void setIdBook(Long idBook) {
        this.idBook = idBook;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getNumPages() {
        return numPages;
    }

    public void setNumPages(Long numPages) {
        this.numPages = numPages;
    }

    public Long getIdAuthorBook() {
        return idAuthorBook;
    }

    public void setIdAuthorBook(Long idAuthorBook) {
        this.idAuthorBook = idAuthorBook;
    }

    public Long getIdEditorialBook() {
        return idEditorialBook;
    }

    public void setIdEditorialBook(Long idEditorialBook) {
        this.idEditorialBook = idEditorialBook;
    }

    public DTOAuthor getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(DTOAuthor authorBook) {
        this.authorBook = authorBook;
    }

    public DTOEditorial getEditorialBook() {
        return editorialBook;
    }

    public void setEditorialBook(DTOEditorial editorialBook) {
        this.editorialBook = editorialBook;
    }
}
