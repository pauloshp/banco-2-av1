package br.edu.unijuazeiro.petshop;

import java.util.List;

import br.edu.unijuazeiro.petshop.DAO.ClienteDAO;
import br.edu.unijuazeiro.petshop.model.Cliente;

/**
 * Hello world!
 */
public final class AppCliente {
    private AppCliente() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        ClienteDAO dao = new ClienteDAO();

        // Insert Cliente
        // Cliente c = new Cliente();
        // c.setName("João");
        // c.setCpf("456");
        // dao.persist(c);
        
        // Select Cliente by Id
        Cliente c = dao.findId(4);
        System.out.println("Id: " + c.getCodigo());
        System.out.println("Nome: " + c.getNome());
        System.out.println("CPF: " + c.getCpf());

        // Update Cliente
        // c.setName("Jośe");
        // c.setCpf("000.888.789.00");
        // dao.merge(c);

        // Delete Cliente
        dao.remove(c);

        // Litar Todos os Clientes
        // List<Cliente> clientes = dao.listAll();
        // for (Cliente cliente : clientes) {
        //     System.out.println("Id: " + cliente.getCode());
        //     System.out.println("Nome: " + cliente.getName());
        //     System.out.println("CPF: " + cliente.getCpf());
        // }

    }
}
