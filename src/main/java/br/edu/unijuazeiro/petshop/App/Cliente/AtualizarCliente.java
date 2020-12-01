package br.edu.unijuazeiro.petshop.App.Cliente;

import br.edu.unijuazeiro.petshop.DAO.ClienteDAO;
import br.edu.unijuazeiro.petshop.model.Cliente;

public class AtualizarCliente {
    public static void main(String[] args) {

       // Update Cliente
        ClienteDAO dao = new ClienteDAO();
        
        Cliente c = dao.findId(4);
        c.setNome("");
        c.setCpf("");
        dao.merge(c);
    }
}