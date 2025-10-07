package com.example.sistemabancario.model;

public abstract class Conta {

    private String numero;
    private Cliente titular;
    private double saldo;


    public Conta(String numero, Cliente titular,double saldo) {

        this.numero=numero;
        this.titular=titular;
        this.saldo=saldo;
    }

    public void setNumero(String numero){
        this.numero=numero;
    }
    public void setTitular(Cliente titular){
        this.titular=titular;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    public String getNumero(){
        return numero;
    }
    public Cliente getTitular(){
        return titular;
    }
    public double getSaldo(){
        return saldo;
    }

    public abstract void mostrarDetalhes();

    @Override
    public String toString() {

        return "Conta n.º" + numero +"\nTitular: " + titular.getNome() +"\nSaldo: " + saldo;
    }

}
