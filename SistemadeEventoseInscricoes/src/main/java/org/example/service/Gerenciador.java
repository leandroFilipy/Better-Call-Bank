package org.example.service;

import org.example.dao.ParticipanteDao;
import org.example.model.Participante;
import org.example.view.View;

import java.sql.SQLException;

public class Gerenciador {


    public void gerenciar(int decisao2) throws SQLException {

        var view = new View();
        ParticipanteDao participanteDao = new ParticipanteDao();

        switch (decisao2){


            case 1 -> {

            String nomeParticipante2 = view.nomeParticipante();
            String emailParticipante2 = view.emailParticipante();
            String telefoneParticipante2 = view.telefonelParticipante();

            if(nomeParticipante2.isEmpty() && telefoneParticipante2.isEmpty()){

                    view.messagemNomeTelefoneParticipanteVazio();
                    return;
                }
            else if(nomeParticipante2.isEmpty()){

                view.messagemNomeParticipanteVazio();
                return;
            }else if(telefoneParticipante2.isEmpty()){

                view.messagemTelefoneParticipanteVazio();
                return;
            }

            Participante participante = new Participante(nomeParticipante2, emailParticipante2, telefoneParticipante2);

            if(participanteDao.verificaSeTelefoneExist(telefoneParticipante2)){

                view.mensagemTelefoneJaCadastrado();
                return;
            }
            participanteDao.cadastrarParticipante(participante);
            }

        }
    }
}
