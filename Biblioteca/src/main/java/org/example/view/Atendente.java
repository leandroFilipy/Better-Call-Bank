package org.example.view;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Atendente {

    Scanner read = new Scanner(System.in);


    public int menu(){

        System.out.println("============================================================================");
        System.out.println("||                        Bem vindo a Biblioteca                          ||");
        System.out.println("||------------------------------------------------------------------------||");
        System.out.println("|| 1 - Cadastrar Usuário                                                  ||");
        System.out.println("|| 2 - Cadastrar Livro                                                    ||");
        System.out.println("|| 3 - Registrar Empréstimo                                               ||");
        System.out.println("||------------------------------------------------------------------------||");
        System.out.println("|| Insira aqui: ");
        int decisao = read.nextInt();

        read.nextLine();


        return decisao;
    }


    public String usuarioNome(){

        System.out.println("||------------------------------------------------------------------------||");
        System.out.println("||                     Insira o nome do novo Usuário                      ||");
        System.out.println("||------------------------------------------------------------------------||");
        String usuarioNome = read.nextLine();

        return usuarioNome;
    }
    public String usuarioMatricula(){

        System.out.println("||------------------------------------------------------------------------||");
        System.out.println("||                   Insira a mátricula do novo Usuário                   ||");
        System.out.println("||------------------------------------------------------------------------||");
        String usuarioMatricula = read.nextLine();

        return usuarioMatricula;
    }
    public String usuarioTipo(){

        System.out.println("||------------------------------------------------------------------------||");
        System.out.println("||                     Insira o tipo do novo Usuário                      ||");
        System.out.println("|| 1 - Aluno                                                              ||");
        System.out.println("|| 2 - Professor                                                          ||");
        System.out.println("||------------------------------------------------------------------------||");
        String usuarioTipo = read.nextLine();

        return usuarioTipo;
    }
    public void usuarioNomeObrigatorio(){

        System.err.println("||------------------------------------------------------------------------||");
        System.err.println("||                       O campo nome está vazio                          ||");
        System.err.println("||------------------------------------------------------------------------||");
    }
    public void usuarioMatriculaObrigatorio(){

        System.err.println("||------------------------------------------------------------------------||");
        System.err.println("||                     O campo mátricula está vazio                       ||");
        System.err.println("||------------------------------------------------------------------------||");
    }
    public void usuarioTipoObrigatorio(){

        System.err.println("||------------------------------------------------------------------------||");
        System.err.println("||                    O campo Tipo usuário está vazio                     ||");
        System.err.println("||------------------------------------------------------------------------||");
    }
    public void usuarioMatriculaExistente(){
        System.err.println("||------------------------------------------------------------------------||");
        System.err.println("||                   Esta mátricula já esta registrada                    ||");
        System.err.println("||------------------------------------------------------------------------||");
    }
    public void usuarioComTipoIncorreto(){
        System.err.println("||------------------------------------------------------------------------||");
        System.err.println("||              O tipo do usuário deve ser Aluno ou Professor             ||");
        System.err.println("||------------------------------------------------------------------------||");
    }
    public void usuarioCadastrado(){
        System.out.println("||------------------------------------------------------------------------||");
        System.out.println("||                 O usuário foi cadastrado com sucesso                   ||");
        System.out.println("||------------------------------------------------------------------------||");
    }
    public void usuarioNaoCadastrado(){
        System.err.println("||------------------------------------------------------------------------||");
        System.err.println("||            O usuário não foi cadastrado devido a falha acima           ||");
        System.err.println("||------------------------------------------------------------------------||");
    }
    public String livroTitulo(){

        System.out.println("||------------------------------------------------------------------------||");
        System.out.println("||                     Insira o título do novo livro                      ||");
        System.out.println("||------------------------------------------------------------------------||");
        String livroTitulo = read.nextLine();

        return livroTitulo;
    }
    public String livroAutor(){

        System.out.println("||------------------------------------------------------------------------||");
        System.out.println("||                         Insira o autor do livro                        ||");
        System.out.println("||------------------------------------------------------------------------||");
        String livroAutor = read.nextLine();

        return livroAutor;
    }
    public String livroISBN(){

        System.out.println("||------------------------------------------------------------------------||");
        System.out.println("||                         Insira o ISBN do livro                        ||");
        System.out.println("||------------------------------------------------------------------------||");
        String livroISBN = read.nextLine();

        return livroISBN;
    }
    public int livroEstoqueInicial(){

        System.out.println("||------------------------------------------------------------------------||");
        System.out.println("||                    Insira o estoque inicial do livro                   ||");
        System.out.println("||------------------------------------------------------------------------||");
        int livroEstoqueInicial = read.nextInt();

        read.nextLine();
        return livroEstoqueInicial;
    }
    public void livroTituloObrigatorio(){

        System.err.println("||------------------------------------------------------------------------||");
        System.err.println("||                      O campo titulo está vazio                         ||");
        System.err.println("||------------------------------------------------------------------------||");
    }
    public void livroISBNObrigatorio(){

        System.err.println("||------------------------------------------------------------------------||");
        System.err.println("||                        O campo ISBN está vazio                         ||");
        System.err.println("||------------------------------------------------------------------------||");
    }
    public void livroOSBNDuplicado(){

        System.err.println("||------------------------------------------------------------------------||");
        System.err.println("||               Este ISBN já esta registrado, tente outro                ||");
        System.err.println("||------------------------------------------------------------------------||");
    }
    public void livroCadastrado(){
        System.out.println("||------------------------------------------------------------------------||");
        System.out.println("||                   O livro foi cadastrado com sucesso                   ||");
        System.out.println("||------------------------------------------------------------------------||");
    }
    public void livroNaoCadastrado(){
        System.err.println("||------------------------------------------------------------------------||");
        System.err.println("||             O livro não foi cadastrado devido a falha acima            ||");
        System.err.println("||------------------------------------------------------------------------||");
    }
    public void livroEstoqueNegativo(){
        System.err.println("||------------------------------------------------------------------------||");
        System.err.println("||             o estoque desse produto não pode ser abaixo de 0           ||");
        System.err.println("||------------------------------------------------------------------------||");
    }
    public int livrosQuantosLivros(){

        System.out.println("||------------------------------------------------------------------------||");
        System.out.println("||                    Quantos livros deseja emprestar?                    ||");
        System.out.println("||------------------------------------------------------------------------||");
        int livrosQuantosLivros = read.nextInt();

        read.nextLine();
        return livrosQuantosLivros;
    }
    public int idLivro(){

        System.out.println("||------------------------------------------------------------------------||");
        System.out.println("||                    Quantos livros deseja emprestar?                    ||");
        System.out.println("||------------------------------------------------------------------------||");
        int idLivro = read.nextInt();

        read.nextLine();
        return idLivro;
    }
    public int idLivroEmprestar(){

        System.out.println("||------------------------------------------------------------------------||");
        System.out.println("||                   Qual o id do livro pra emprestar?                    ||");
        System.out.println("||------------------------------------------------------------------------||");
        int idLivro = read.nextInt();

        read.nextLine();
        return idLivro;
    }


}
