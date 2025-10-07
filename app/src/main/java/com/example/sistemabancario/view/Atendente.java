package com.example.sistemabancario.view;
import java.util.Scanner;

public class Atendente {

    Scanner read = new Scanner(System.in);

    public int menu() {

        System.out.println("========================");
        System.out.println("----Better Call Bank----");
        System.out.println("------------------------");
        System.out.println("1 - Criar uma conta corrente");
        System.out.println("2 - Criar uma conta poupança");
        System.out.println("3 - Fazer um depósito");
        System.out.println("4 - Fazer um saque");
        System.out.println("5 - Fazer uma transferência");
        System.out.println("6 - Listar Contas");
        System.out.println("0 - Sair");
        System.out.print("Insira o que deseja: ");
        int decisaoMenu = read.nextInt();

        return decisaoMenu;
    }


}
