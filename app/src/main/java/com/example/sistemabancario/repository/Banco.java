package com.example.sistemabancario.repository;
import com.example.sistemabancario.model.*;
import java.util.ArrayList;
import java.util.List;

public class Banco {

    ArrayList<Conta> contas = new ArrayList<>();

    public void cadastrarConta(Conta conta) {

        contas.add(conta);
    }

    public void depositar(Conta conta, double valor) {

        if (valor <= 0)
            throw new IllegalArgumentException("Não é possível fazer um depósito com este valor");
        conta.setSaldo(conta.getSaldo() + valor);
    }

    public void sacar(Conta conta, double valor) {

        if (valor <= 0)
            throw new IllegalArgumentException("Não é possível fazer um saque com este valor");
        if (conta.getSaldo() < valor) throw new IllegalArgumentException("Saldo insuficiente");
        conta.setSaldo(conta.getSaldo() - valor);
    }

    public void transferencia(Conta contaOrigem, Conta contaDestino, double valor) {

        sacar(contaOrigem, valor);
        depositar(contaDestino, valor);
    }

    public void listarContas(Conta conta) {

        for (Conta ver : contas) {
            conta.mostrarDetalhes();
        }
    }

    public Conta buscarPorNumero(String numero) {
        for (Conta ver : contas) {
            if (ver.getNumero().equals(numero)) {
                return ver;
            }
        }
        return null;
    }


}
