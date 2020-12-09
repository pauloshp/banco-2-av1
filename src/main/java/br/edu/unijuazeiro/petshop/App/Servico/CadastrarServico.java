package br.edu.unijuazeiro.petshop.App.Servico;

import javax.persistence.EntityManager;

import br.edu.unijuazeiro.petshop.DAO.Conexao.ConexaoFabrica;
import br.edu.unijuazeiro.petshop.model.Cliente.Cliente;
import br.edu.unijuazeiro.petshop.model.Cliente.Pet;
import br.edu.unijuazeiro.petshop.model.Negocios.Funcionario;
import br.edu.unijuazeiro.petshop.model.Negocios.Servico;

public class CadastrarServico {
    
    public static void main(String[] args) {
        
        EntityManager em = ConexaoFabrica.getEntityManager();

        Cliente c = em.find(Cliente.class, 1);
        Pet p = em.find(Pet.class, 1);
        Funcionario f = em.find(Funcionario.class, 1);

        Servico servico = new Servico();
        servico.setTipo("Tosa");
        servico.setValor(40.0);
        servico.setCliente(c);
        servico.setFuncionario(f);
        servico.setPet(p);

    }

}
