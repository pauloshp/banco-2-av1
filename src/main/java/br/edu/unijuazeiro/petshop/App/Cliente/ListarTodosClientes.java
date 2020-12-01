package br.edu.unijuazeiro.petshop.App.Cliente;

import br.edu.unijuazeiro.petshop.DAO.ClienteDAO;
import br.edu.unijuazeiro.petshop.model.Cliente;

import java.util.List;


public final class ListarTodosClientes {
    public static void main(String[] args) {

        // Listar Todos os Clientes
        ClienteDAO dao = new ClienteDAO();

         List<Cliente> clientes = dao.listAll();
         for (Cliente cliente : clientes) {
            System.out.println("Id: " + cliente.getCodigo());
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
        }
    }
}