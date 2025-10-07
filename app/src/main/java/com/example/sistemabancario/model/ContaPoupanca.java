package com.example.sistemabancario.model;

public class ContaPoupanca extends Conta{

    private double rendimento;

    public ContaPoupanca(String numero, Cliente titular, double saldo, double rendimento) {

        super(numero, titular, saldo);
        this.rendimento=rendimento;
    }

    public void setRendimento(double rendimento){
        this.rendimento=rendimento;
    }
    public double getRendimento(){
        return rendimento;
    }

    @Override
    public void mostrarDetalhes(){
        System.out.println("Conta Poupança --> " + super.toString() + "\nRendimento: " + rendimento + " % ao mês");
    }
}
