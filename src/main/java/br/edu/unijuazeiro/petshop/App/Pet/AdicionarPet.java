package br.edu.unijuazeiro.petshop.App.Pet;

import br.edu.unijuazeiro.petshop.DAO.PetDAO;
import br.edu.unijuazeiro.petshop.model.Cliente.Cliente;
import br.edu.unijuazeiro.petshop.model.Cliente.Pet;

public class AdicionarPet {
    public static void main(String[] args) {
        
        PetDAO dao = new PetDAO();

        // Insert Pet
        Cliente c = new Cliente();
        c.setCodigo(1);

        Pet a = new Pet();
        a.setNome("Kaio");
        a.setRaca("Cãomunista");
        a.setCliente(c);
        dao.persist(a);
    }   
}