package br.edu.unijuazeiro.petshop.App.Cliente;

import br.edu.unijuazeiro.petshop.DAO.ClienteDAO;
import br.edu.unijuazeiro.petshop.model.Cliente;
import br.edu.unijuazeiro.petshop.model.Endereco;

public class AtualizarCliente {
    public static void main(String[] args) {

       // Update Cliente
        ClienteDAO dao = new ClienteDAO();
        
        Cliente c = dao.findId(4);
        c.setNome("Thiago");
        c.setCpf("100.100.100-10");
        c.setEmail("xico@bol.uol.msn.edu.br");
        //c.setEndereco(Endereco);
        dao.merge(c);
    }
}