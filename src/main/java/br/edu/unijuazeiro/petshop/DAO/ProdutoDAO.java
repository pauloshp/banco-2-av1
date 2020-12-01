package br.edu.unijuazeiro.petshop.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import br.edu.unijuazeiro.petshop.DAO.Conexao.ConexaoFabrica;
import br.edu.unijuazeiro.petshop.model.Produto;

public class ProdutoDAO {
    public List<Produto> listAll() {
        EntityManager em = ConexaoFabrica.getEntityManager();
        return em.createQuery("from Produto", Produto.class).getResultList();
    }

    public Produto findId(int id) {
        EntityManager em = ConexaoFabrica.getEntityManager();
        return em.find(Produto.class, id);
    }

    public void persist(Produto produto) {
        EntityManager em = ConexaoFabrica.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(produto);
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

    public void merge(Produto produto) {
        EntityManager em = ConexaoFabrica.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(produto);
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

    public void remove(Produto produto) {
        EntityManager em = ConexaoFabrica.getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(produto);
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