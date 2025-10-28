package org.example.model;

public class Livro {

    private int id;
    private String titulo;
    private String autor;
    private String isbn;
    private int quantidadeInicialEmEstoque;

    public Livro(String titulo, String autor, String isbn, int quantidadeInicialEmEstoque) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.quantidadeInicialEmEstoque = quantidadeInicialEmEstoque;
    }

    public Livro(int id, String titulo, String autor, String isbn, int quantidadeInicialEmEstoque) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.quantidadeInicialEmEstoque = quantidadeInicialEmEstoque;
    }

    public Livro(){
        this.titulo="";
        this.autor="";
        this.isbn="";
        this.quantidadeInicialEmEstoque=0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getQuantidadeInicialEmEstoque() {
        return quantidadeInicialEmEstoque;
    }

    public void setQuantidadeInicialEmEstoque(int quantidadeInicialEmEstoque) {
        this.quantidadeInicialEmEstoque = quantidadeInicialEmEstoque;
    }
}
