package br.edu.unijuazeiro.petshop.DAO;

import java.util.List;

import javax.persistence.EntityManager;


import br.edu.unijuazeiro.petshop.DAO.Conexao.ConexaoFabrica;
import br.edu.unijuazeiro.petshop.model.Pet;

public class PetDAO {

    public List<Pet> listAll() {
        EntityManager em = ConexaoFabrica.getEntityManager();
        return em.createQuery("from Pet", Pet.class).getResultList();
    }

    public Pet findId(int id) {
        EntityManager em = ConexaoFabrica.getEntityManager();
        return em.find(Pet.class, id);
    }

    public void persist(Pet pet) {
        EntityManager em = ConexaoFabrica.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(pet);
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

    public void merge(Pet pet) {
        EntityManager em = ConexaoFabrica.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(pet);
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

    public void remove(Pet pet) {
        EntityManager em = ConexaoFabrica.getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(pet);
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
