package br.edu.unijuazeiro.petshop.App.Cliente;

import java.util.List;

import br.edu.unijuazeiro.petshop.DAO.ClienteDAO;
import br.edu.unijuazeiro.petshop.model.Cliente.Cliente;

public class BuscarCliente {

    public static void main(String[] args) {

        ClienteDAO dao = new ClienteDAO();

        // Buscar Cliente pelo Nome
        List<Cliente> clientes = dao.findByName("Thiago");
        clientes.forEach(c -> {
            System.out.println("Id: " + c.getCodigo());
            System.out.println("Nome: " + c.getNome());
            System.out.println("Email: " + c.getEmail());
            System.out.println("CPF: " + c.getCpf());
        });

        // Buscar Cliente pelo email; 
        Cliente c = dao.findByEmail("xico@bol.uol.msn.edu.br");
        System.out.println("Id: " + c.getCodigo());
        System.out.println("Nome: " + c.getNome());
        System.out.println("Email: " + c.getEmail());
        System.out.println("CPF: " + c.getCpf());

    }
}
