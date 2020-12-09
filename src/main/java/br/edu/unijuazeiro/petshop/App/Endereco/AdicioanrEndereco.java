package br.edu.unijuazeiro.petshop.App.Endereco;

import javax.persistence.EntityManager;

import br.edu.unijuazeiro.petshop.DAO.Conexao.ConexaoFabrica;
import br.edu.unijuazeiro.petshop.model.Cliente.Endereco;

public class AdicioanrEndereco {
    
    public static void main(String[] args) {
        
        EntityManager em = ConexaoFabrica.getEntityManager();
        Endereco endereco = new Endereco();

        em.getTransaction().begin();
        endereco.setRua("Rua Padre Cicero");
        endereco.setCEP("56280000");
        endereco.setNumero(589);
        endereco.setEstado("Pernambuco");
        endereco.setCidade("Araripina");

        em.persist(endereco);
        em.getTransaction().commit();
        em.close();

    }

}
