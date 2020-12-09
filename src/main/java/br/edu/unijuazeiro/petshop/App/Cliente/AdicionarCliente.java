package br.edu.unijuazeiro.petshop.App.Cliente;

import javax.persistence.EntityManager;

import br.edu.unijuazeiro.petshop.DAO.ClienteDAO;
import br.edu.unijuazeiro.petshop.DAO.Conexao.ConexaoFabrica;
import br.edu.unijuazeiro.petshop.model.Cliente.Cliente;
import br.edu.unijuazeiro.petshop.model.Cliente.Endereco;


public class AdicionarCliente {
    public static void main(String[] args) {

        ClienteDAO dao = new ClienteDAO();
        EntityManager em = ConexaoFabrica.getEntityManager();

        // Insert Cliente
        Endereco e = em.find(Endereco.class, 1);

        Cliente c = new Cliente();
        c.setNome("Thiago");
        c.setCpf("100.100.100-10");
        c.setEmail("email@email.com");
        c.setEndereco(e);
        dao.persist(c);
    }
}






 