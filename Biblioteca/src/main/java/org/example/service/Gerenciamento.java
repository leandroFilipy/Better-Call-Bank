package org.example.service;

import org.example.dao.LivroDAO;
import org.example.dao.UsuarioDAO;
import org.example.model.Livro;
import org.example.model.Usuario;
import org.example.view.Atendente;

import java.sql.SQLException;

public class Gerenciamento {

    UsuarioDAO usuarioDAO = new UsuarioDAO();

    public void gerenciamento(Atendente atendente, int decisao2) throws SQLException {


        switch (decisao2){

            case 1 -> {

            String usuarioNome2 = atendente.usuarioNome();
            String usuarioMatricula2 = atendente.usuarioMatricula();
            String usuarioTipo2 = atendente.usuarioTipo();

            if(usuarioNome2.isEmpty() && usuarioMatricula2.isEmpty() && usuarioTipo2.isEmpty()){
                atendente.usuarioNomeObrigatorio();
                atendente.usuarioMatriculaObrigatorio();
                atendente.usuarioTipoObrigatorio();
                atendente.usuarioNaoCadastrado();
                return;
            } else if (usuarioNome2.isEmpty()) {
                atendente.usuarioNomeObrigatorio();
                atendente.usuarioNaoCadastrado();
                return;
            } else if (usuarioMatricula2.isEmpty()) {
                atendente.usuarioMatriculaObrigatorio();
                atendente.usuarioNaoCadastrado();
                return;
            }else if(usuarioTipo2.isEmpty()){
                atendente.usuarioTipoObrigatorio();
                atendente.usuarioNaoCadastrado();
                return;
            }

            boolean verificacao = usuarioDAO.verificaDuplicidadeMatricula(usuarioMatricula2);
            if(verificacao){
                atendente.usuarioMatriculaExistente();
                atendente.usuarioNaoCadastrado();
                return;
            }

            if(usuarioTipo2.toLowerCase().equals("professor") || usuarioTipo2.toLowerCase().equals("aluno")){

                    var usuario = new Usuario(usuarioNome2, usuarioMatricula2, usuarioTipo2);
                    usuarioDAO.cadastrarUsuario(usuario);
                    atendente.usuarioCadastrado();
                }else{
                atendente.usuarioComTipoIncorreto();
                atendente.usuarioNaoCadastrado();
                return;
            }

            }

            case 2 ->{

                String tituloLivro2 = atendente.livroTitulo();
                String livroAutor2 = atendente.livroAutor();
                String livroISBN2 = atendente.livroISBN();
                int estoqueInicial = atendente.livroEstoqueInicial();

                if(tituloLivro2.isEmpty() && livroISBN2.isEmpty()){
                    atendente.livroTituloObrigatorio();
                    atendente.livroISBNObrigatorio();
                    atendente.livroNaoCadastrado();
                    return;
                }else if(tituloLivro2.isEmpty()){
                    atendente.livroTituloObrigatorio();
                    atendente.livroNaoCadastrado();
                    return;
                }else if(livroISBN2.isEmpty()){
                    atendente.livroISBNObrigatorio();
                    atendente.livroNaoCadastrado();
                    return;
                }

                LivroDAO livroDAO = new LivroDAO();

                if(livroDAO.verificaISBNDuplicado(livroISBN2)){

                    atendente.livroOSBNDuplicado();
                    atendente.livroNaoCadastrado();
                    return;
                }
                if(estoqueInicial >= 0){

                    Livro livro = new Livro(tituloLivro2, livroAutor2, livroISBN2, estoqueInicial);
                    livroDAO.registrarLivro(livro);
                    atendente.livroCadastrado();
                    return;
                }else{
                    atendente.livroEstoqueNegativo();
                    atendente.livroNaoCadastrado();
                    return;
                }


            }

            case 3 -> {

                var usuario = new Usuario();

                String matricula3 = atendente.usuarioMatricula();
                int livrosAEmprestar = atendente.livrosQuantosLivros();
                LivroDAO livroDao = new LivroDAO();
                livroDao.listarLivros();
                int idLivroEmprestar2 = atendente.idLivroEmprestar();

                if(usuarioDAO.verificaDuplicidadeMatricula(matricula3)){



                    }
                }

            }

        }

    }
}
