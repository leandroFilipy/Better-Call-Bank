package org.example.service;

import org.example.model.Usuario;
import org.example.repository.UsuarioDao;

import java.sql.SQLException;

public class UsuarioService {

    public static void cadastrarUsuario() throws SQLException {

        var usuarioDao = new UsuarioDao();
        var usuario = new Usuario();
        if(!usuarioDao.usuarioExiste(usuario.getNome())){
            throw new RuntimeException("Usuário já existe");

        }
    usuarioDao.inserirUsuario(usuario);
    }
}
