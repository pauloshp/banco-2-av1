package br.edu.unijuazeiro.petshop.App.Pet;

import br.edu.unijuazeiro.petshop.DAO.PetDAO;
import br.edu.unijuazeiro.petshop.model.Pet;

public class RemoverPet {
    public static void main(String[] args) {

        PetDAO dao = new PetDAO();
        Pet p = dao.findId(2);
        System.out.println("Id: " + p.getCodigo());
        System.out.println("Nome: " +p.getNome());
        System.out.println("Raça: " + p.getRaca());
        dao.remove(p);
    }
}