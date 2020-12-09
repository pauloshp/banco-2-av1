package br.edu.unijuazeiro.petshop.App.Funcionario;

import br.edu.unijuazeiro.petshop.DAO.FuncionarioDAO;
import br.edu.unijuazeiro.petshop.model.Negocios.Funcionario;

public class AdicionarFuncionario {
    public static void main(String[] args) {

        FuncionarioDAO dao = new FuncionarioDAO();

        Funcionario f = new Funcionario();
        f.setNome("Paulo");
        f.setCpf("00000000000");
        f.setTelefone("88000000");
        f.setEmail("email@email.com");
        f.setFuncao("Gerente");
        f.setSenha("1232");
        dao.persist(f);
    }
}