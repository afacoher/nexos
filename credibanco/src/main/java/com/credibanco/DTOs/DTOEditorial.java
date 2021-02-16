package com.credibanco.DTOs;

import java.util.List;

public class DTOEditorial {
    private Long idEditorial;
    private String nameEditorial;
    private String address;
    private Long phone;
    private String emailEditorial;
    private Long maxBooks;

    public Long getIdEditorial() {
        return idEditorial;
    }

    public void setIdEditorial(Long idEditorial) {
        this.idEditorial = idEditorial;
    }

    public String getNameEditorial() {
        return nameEditorial;
    }

    public void setNameEditorial(String nameEditorial) {
        this.nameEditorial = nameEditorial;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEmailEditorial() {
        return emailEditorial;
    }

    public void setEmailEditorial(String emailEditorial) {
        this.emailEditorial = emailEditorial;
    }

    public Long getMaxBooks() {
        return maxBooks;
    }

    public void setMaxBooks(Long maxBooks) {
        this.maxBooks = maxBooks;
    }
}
