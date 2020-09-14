package br.com.fivecode.dao;

import br.com.fivecode.model.HibernateSession;
import br.com.fivecode.model.User;
import org.hibernate.*;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class UserDao {

    public int salvarUsuario(User user){
        Session session = HibernateSession.getSessionFactory().openSession();
        Integer idUsuarioInserido = 0;

        try{
           Transaction transaction = session.beginTransaction();
           idUsuarioInserido = (Integer) session.save(user);
            transaction.commit();

        }catch (HibernateError he){
            he.printStackTrace();
        }finally {
            if(session != null) session.close();
        }

        return idUsuarioInserido;
    }

    public List<User> listarUsuarios(){
        Session session = HibernateSession.getSessionFactory().openSession();
        List<User> listaUser = null;
        try{
            Query query = session.createQuery("from User");
            listaUser = query.list();
        }catch (HibernateError he){
            he.printStackTrace();
        }finally {
            if(session != null) session.close();
        }
        return  listaUser;
    }

    public void excluirUsuario(int idUsuario){
        Session session = HibernateSession.getSessionFactory().openSession();
        try{
            Transaction transaction = session.beginTransaction();
            Query query = session.createQuery("delete from User where idUsuario = :id" );
            query.setParameter("id",idUsuario);
            query.executeUpdate();
            transaction.commit();
            System.out.println("Usuário Excluido com sucesso!!!");
        }catch (HibernateError he){
            he.printStackTrace();
        }finally {
            if(session != null) session.close();
        }

    }

    public User getUsuarioPorId(Integer idUsuario){


        Session session = HibernateSession.getSessionFactory().openSession();
        User usuario = null;
        try{
            Query<User> query = session.createQuery("from User where id = :id");
            query.setParameter("id",idUsuario);
            usuario = query.getSingleResult();
            Hibernate.initialize(usuario.getOptions());
        }catch (HibernateError he){
            he.printStackTrace();
        }finally {
            if(session != null) session.close();
        }
        return  usuario;


    }
    public void atualizarUsuario(User user){
        Session session = HibernateSession.getSessionFactory().openSession();


        try{
            Transaction transaction = session.beginTransaction();
            session.update(user);
            transaction.commit();
            System.out.println("Usuário Cadastrado com sucesso!!!");
        }catch (HibernateError he){
            he.printStackTrace();
        }finally {
            if(session != null) session.close();
        }

    }
}
