package br.com.fivecode.controller;

import br.com.fivecode.dao.OpcaoDao;
import br.com.fivecode.model.Opcao;

public class OptionController {
    private final OpcaoDao USER_DAO = new OpcaoDao();

    public Opcao getOpcaoPorId(Integer idOpcao){
        return this.USER_DAO.getOptionId(idOpcao);
    }

    public int salvarOpcao(Opcao opcao){
        return this.USER_DAO.salvarOpcao(opcao);
    }
}
