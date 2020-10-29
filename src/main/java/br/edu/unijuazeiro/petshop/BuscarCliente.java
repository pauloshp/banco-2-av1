package br.edu.unijuazeiro.petshop;

import br.edu.unijuazeiro.petshop.DAO.ClienteDAO;
import br.edu.unijuazeiro.petshop.model.Cliente;

public class BuscarCliente {

    public static void main(String[] args) {

        // Select Cliente by Id
        ClienteDAO dao = new ClienteDAO();

        Cliente c = dao.findId(1);
        System.out.println("Id: " + c.getCodigo());
        System.out.println("Nome: " + c.getNome());
        System.out.println("CPF: " + c.getCpf());
    }
}
