package br.edu.unijuazeiro.petshop;

import java.util.List;

import br.edu.unijuazeiro.petshop.DAO.PetDAO;
import br.edu.unijuazeiro.petshop.model.Cliente;
import br.edu.unijuazeiro.petshop.model.Pet;

public class AppPet {
    
    public static void main(String[] args) {
        
        PetDAO dao = new PetDAO();

        // Insert Pet
        Cliente c = new Cliente();
        c.setCodigo(1);

        Pet a = new Pet();
        a.setNome("Theo");
        a.setRaca("Dog");
        a.setCliente(c);
        dao.persist(a);
        
        // Select Pet
        // Pet a = dao.findId(3);
        // System.out.println("Id: " + a.getCode());
        // System.out.println("Nome: " + a.getName());
        // System.out.println("CPF: " + a.getRaca());

        // Update Pet
        // a.setName("Paulo");
        // a.setRaca("Gato");
        // dao.merge(a);

        // Delete Pet
        // dao.remove(3);

        // Litar Todos os Pets
        // List<Pet> pets = dao.listAll();
        // for (Pet pet : pets) {
        //     System.out.println("Id: " + pet.getCode());
        //     System.out.println("Nome: " + pet.getName());
        //     System.out.println("Raça: " + pet.getRaca());
        // }

    }

}
