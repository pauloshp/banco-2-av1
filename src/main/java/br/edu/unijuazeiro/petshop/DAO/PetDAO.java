package br.edu.unijuazeiro.petshop.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.unijuazeiro.petshop.model.Pet;

public class PetDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pet-Shop");
    EntityManager em = emf.createEntityManager();

    public List<Pet> listAll() {
        return em.createQuery("from Pet", Pet.class).getResultList();
    }

    public Pet findId(int id) {
        return em.find(Pet.class, id);
    }

    public void persist(Pet pet) {
        try {
            em.getTransaction().begin();
            em.persist(pet);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public void merge(Pet pet) {
        try {
            em.getTransaction().begin();
            em.merge(pet);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public void remove(Pet pet) {
        try {
            em.getTransaction().begin();
            em.remove(pet);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
}
