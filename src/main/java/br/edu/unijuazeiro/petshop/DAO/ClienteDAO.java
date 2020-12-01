package br.edu.unijuazeiro.petshop.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import br.edu.unijuazeiro.petshop.DAO.Conexao.ConexaoFabrica;
import br.edu.unijuazeiro.petshop.model.Cliente;

public class ClienteDAO {


    
    public List<Cliente> listAll() {
        EntityManager em = ConexaoFabrica.getEntityManager();
        return em.createQuery("from Cliente", Cliente.class).getResultList();
    }

    public Cliente findId(int id) {
        EntityManager em = ConexaoFabrica.getEntityManager();
        return em.find(Cliente.class, id);
    }

    public void persist(Cliente cliente) {
        EntityManager em = ConexaoFabrica.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            if (em.getTransaction().isActive()){
            em.getTransaction().rollback();
            }
        } finally {
            if (em.isOpen()){
                em.close();
            }
        }
    }

    public void merge(Cliente cliente) {
        EntityManager em = ConexaoFabrica.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(cliente);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            if (em.getTransaction().isActive()){
            em.getTransaction().rollback();
            }
        } finally {
            if (em.isOpen()){
                em.close();
            }
        }
    }

    public void remove(Cliente cliente) {
        EntityManager em = ConexaoFabrica.getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(cliente);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            if (em.getTransaction().isActive()){
            em.getTransaction().rollback();
            }
        } finally {
            if (em.isOpen()){
                em.close();
            }
        }
    }   

}
