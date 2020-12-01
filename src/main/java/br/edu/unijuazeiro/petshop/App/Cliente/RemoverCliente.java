package br.edu.unijuazeiro.petshop.App.Cliente;

import br.edu.unijuazeiro.petshop.DAO.ClienteDAO;
import br.edu.unijuazeiro.petshop.model.Cliente;

public class RemoverCliente {
    public static void main(String[] args) {

        // Delete Cliente

        ClienteDAO dao = new ClienteDAO();

        Cliente c = dao.findId(5);
        System.out.println("Id: " + c.getCodigo());
        System.out.println("Nome: " + c.getNome());
        System.out.println("CPF: " + c.getCpf());
        dao.remove(c);
    }
}