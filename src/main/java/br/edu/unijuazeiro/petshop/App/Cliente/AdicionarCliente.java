package br.edu.unijuazeiro.petshop.App.Cliente;

import br.edu.unijuazeiro.petshop.DAO.ClienteDAO;
import br.edu.unijuazeiro.petshop.model.Cliente;


public class AdicionarCliente {
    public static void main(String[] args) {

        ClienteDAO dao = new ClienteDAO();

        // Insert Cliente
        Cliente c = new Cliente();
        c.setNome("Thiago");
        c.setCpf("100.100.100-10");
        c.setEmail("xico@bol.uol.msn.edu.br");
        dao.persist(c);
    }
}






 