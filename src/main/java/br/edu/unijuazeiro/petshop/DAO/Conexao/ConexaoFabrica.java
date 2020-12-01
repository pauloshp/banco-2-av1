package br.edu.unijuazeiro.petshop.DAO.Conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConexaoFabrica {
    private static EntityManagerFactory emf;

    static {
        emf = Persistence.createEntityManagerFactory("Pet-Shop");
    }

    private ConexaoFabrica() {

    }

    public static EntityManagerFactory getEmf() {
        return emf;
    }

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public static void close() {
        emf.close();
    }

}