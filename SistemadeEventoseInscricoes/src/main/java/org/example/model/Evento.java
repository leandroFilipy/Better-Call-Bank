package org.example.model;

import java.util.Date;

public class Evento {

    private int id;
    private String nomeEvento;
    private Date data;
    private int capacidadeMaxima;


    public Evento(int id, String nomeEvento, Date data, int capacidadeMaxima) {
        this.id = id;
        this.nomeEvento = nomeEvento;
        this.data = data;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public Evento(String nomeEvento, Date data, int capacidadeMaxima) {
        this.nomeEvento = nomeEvento;
        this.data = data;
        this.capacidadeMaxima = capacidadeMaxima;
    }
    public Evento(){
        this.nomeEvento="";
        this.data=null;
        this.capacidadeMaxima=0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }
}
