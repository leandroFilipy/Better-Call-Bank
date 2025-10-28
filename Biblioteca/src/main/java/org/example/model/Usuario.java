package org.example.model;

public class Usuario {

    private int id;
    private String nome;
    private String matricula;
    private String tipo;


    public Usuario(String nome, String matricula, String tipo) {
        this.nome = nome;
        this.matricula = matricula;
        this.tipo = tipo;
    }

    public Usuario(){
        this.nome="";
        this.matricula="";
        this.tipo="";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
