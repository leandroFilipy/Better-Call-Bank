package com.example.sistemabancario.model;

public class ContaCorrente extends Conta{

    private double limite;

    public ContaCorrente(String numero, Cliente titular, double saldo, double limite) {

        super(numero, titular, saldo);
        this.limite=limite;
    }

    public void setLimite(double limite){
        this.limite=limite;
    }
    public double getLimite(){
        return limite;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Conta Corrente --> " + super.toString() + "\nLimite: " + limite);
    }

}
