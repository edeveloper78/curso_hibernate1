package br.com.fivecode.dao;


import br.com.fivecode.model.HibernateSession;
import br.com.fivecode.model.Opcao;
import br.com.fivecode.model.User;
import org.hibernate.Hibernate;
import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class OpcaoDao {


    public Opcao getOptionId(Integer idOption){


        Session session = HibernateSession.getSessionFactory().openSession();
        Opcao option = null;
        try{
            Query<Opcao> query = session.createQuery("from Opcao where id = :id");
            query.setParameter("id",idOption);
            option = query.getSingleResult();
            Hibernate.initialize(option.getUsuarios());
        }catch (HibernateError he){
            he.printStackTrace();
        }finally {
            if(session != null) session.close();
        }
        return  option;
    }

    public int salvarOpcao(Opcao opcao){
        Session session = HibernateSession.getSessionFactory().openSession();
        Integer idOpcaoInserida = 0;

        try{
            Transaction transaction = session.beginTransaction();
            idOpcaoInserida = (Integer) session.save(opcao);
            transaction.commit();

        }catch (HibernateError he){
            he.printStackTrace();
        }finally {
            if(session != null) session.close();
        }

        return idOpcaoInserida;
    }

}
