package br.edu.unijuazeiro.petshop.App.Pet;

import br.edu.unijuazeiro.petshop.DAO.PetDAO;
import br.edu.unijuazeiro.petshop.model.Cliente.Pet;


public class AtualizarPet {
    public static void main(String[] args) {
        //Update Pet
        PetDAO dao = new PetDAO();
        
        Pet a = dao.findId(2);
        a.setNome("");
        a.setRaca("");
        dao.merge(a);
    }
}