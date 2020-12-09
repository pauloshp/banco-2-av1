package br.edu.unijuazeiro.petshop.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import br.edu.unijuazeiro.petshop.model.Negocios.Funcionario;
import br.edu.unijuazeiro.petshop.DAO.Conexao.ConexaoFabrica;

public class FuncionarioDAO {

    
    public List<Funcionario> listAll() {
        EntityManager em = ConexaoFabrica.getEntityManager();
        return em.createQuery("from Funcionario", Funcionario.class).getResultList();
    }

    public Funcionario findId(Integer codigo) {
        EntityManager em = ConexaoFabrica.getEntityManager();
        return em.find(Funcionario.class, codigo);
    }

    public void persist(Funcionario funcionario) {
        EntityManager em = ConexaoFabrica.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(funcionario);
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

    public void merge(Funcionario funcionario) {
        EntityManager em = ConexaoFabrica.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(funcionario);
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

    public void remove(Funcionario funcionario) {
        EntityManager em = ConexaoFabrica.getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(em.getReference(Funcionario.class, funcionario.getCodigo()));
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

    public Funcionario findByEmail(String email) {
        EntityManager em = ConexaoFabrica.getEntityManager();
        Funcionario f = null;
        try {
            f = em.createQuery("from Funcionario f where f.email = :mail", Funcionario.class).setParameter("mail", email)
                    .getSingleResult();
        } catch (NoResultException e) {
             e.printStackTrace();
             System.out.println("Não foi encontrado funcionario com esse e-mail.");
            return null;
        }
        if (em.isOpen()) {
            em.close();
        }
        return f;
    }

}