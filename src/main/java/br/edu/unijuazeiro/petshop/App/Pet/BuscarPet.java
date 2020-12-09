package br.edu.unijuazeiro.petshop.App.Pet;

import br.edu.unijuazeiro.petshop.DAO.PetDAO;
import br.edu.unijuazeiro.petshop.model.Cliente.Pet;

public class BuscarPet {

    public static void main(String[] args) {
    
        // Buscar Pet pelo Id
        PetDAO dao = new PetDAO();

        Pet a = dao.findId(1);
        System.out.println("Id: " + a.getCodigo());
        System.out.println("Nome: " + a.getNome());
        System.out.println("Raça: " + a.getRaca());
    }
}
