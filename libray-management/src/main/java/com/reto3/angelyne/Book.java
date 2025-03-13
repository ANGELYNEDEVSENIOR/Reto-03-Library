package com.reto3.angelyne;

public class Book {
    private String id;
    private String tittle;
    private String autor;

    //generamos un constructor con los tres atributos
    public Book(String id, String tittle, String autor) {
        this.id = id;
        this.tittle = tittle;
        this.autor = autor;
    }
    public String getId() {
        return id;
    }
    public String getTittle() {
        return tittle;
    }
    public String getAutor() {
        return autor;
    }
   

    
}
