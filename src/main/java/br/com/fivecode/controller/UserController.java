package br.com.fivecode.controller;

import br.com.fivecode.dao.UserDao;
import br.com.fivecode.model.User;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public class UserController {

    private final UserDao USER_DAO = new UserDao();

    public int salvarUsuario(User usuario){
        return this.USER_DAO.salvarUsuario(usuario);
    }

    public List<User> listarTodosUsuarios (){ return this.USER_DAO.listarUsuarios();}

    public void excluirUsuario(int idUsuario){ this.USER_DAO.excluirUsuario(idUsuario); }

    public User getUsuarioPorId(Integer idUsuario) {return this.USER_DAO.getUsuarioPorId(idUsuario);}

    public void atualizarUsuario(User user) {
        this.USER_DAO.atualizarUsuario(user);
    }



}
