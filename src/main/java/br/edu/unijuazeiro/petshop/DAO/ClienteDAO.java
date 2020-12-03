package br.edu.unijuazeiro.petshop.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

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
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            if (em.isOpen()) {
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
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            if (em.isOpen()) {
                em.close();
            }
        }
    }

    public void remove(Cliente cliente) {
        EntityManager em = ConexaoFabrica.getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(em.getReference(Cliente.class, cliente.getCodigo()));
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            if (em.isOpen()) {
                em.close();
            }
        }
    }

    public Cliente findByEmail(String email) {
        EntityManager em = ConexaoFabrica.getEntityManager();
        Cliente c = null;
        try {
            c = em.createQuery("from Cliente c where c.email = :mail", Cliente.class).setParameter("mail", email)
                    .getSingleResult();
        } catch (NoResultException e) {
             e.printStackTrace();
             System.out.println("Não foi encontrado cliente com esse e-mail.");
            return null;
        }
        if (em.isOpen()) {
            em.close();
        }
        return c;
    }

    public List<Cliente> findByName(String nome) {
        EntityManager em = ConexaoFabrica.getEntityManager();
        List<Cliente> clientes = em.createQuery("select c from Cliente c where lower(c.nome) like lower(:nome)", Cliente.class)
                .setParameter("nome", "%" + nome + "%").getResultList();
        if (em.isOpen()) {
            em.close();
        }
        return clientes;
    }

    public List<Cliente> findByNameOrAddress(String nomereco) {
        EntityManager em = ConexaoFabrica.getEntityManager();
        List<Cliente> clientes = em.createQuery("select c from Cliente c join c.endereco a "+
           "where lower(c.nome) like lower(:search) or lower(a.rua) like lower(:search)", Cliente.class)
                .setParameter("search", "%" + nomereco + "%").getResultList();
        if (em.isOpen()) {
            em.close();
        }
        return clientes;
    }

}
