package br.edu.unijuazeiro.petshop.App.Cliente;

import br.edu.unijuazeiro.petshop.DAO.ClienteDAO;
import br.edu.unijuazeiro.petshop.model.Cliente;


public class AdicionarCliente {
    public static void main(String[] args) {

        ClienteDAO dao = new ClienteDAO();

        // Insert Cliente
        Cliente c = new Cliente();
        c.setNome("Paulo");
        c.setCpf("000.000.000-00");
        dao.persist(c);
    }
}






 