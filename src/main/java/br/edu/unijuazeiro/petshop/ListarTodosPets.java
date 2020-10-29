package br.edu.unijuazeiro.petshop;

import java.util.List;

import br.edu.unijuazeiro.petshop.DAO.PetDAO;
import br.edu.unijuazeiro.petshop.model.Pet;

public class ListarTodosPets {
    public static void main(String[] args) {

        // Listar Todos os Pets
        PetDAO dao = new PetDAO();
        List<Pet> pets = dao.listAll();
        for (Pet pet : pets) {
            System.out.println("Id: " + pet.getCodigo());
            System.out.println("Nome: " + pet.getNome());
            System.out.println("Raça: " + pet.getRaca());
        }
    }
}