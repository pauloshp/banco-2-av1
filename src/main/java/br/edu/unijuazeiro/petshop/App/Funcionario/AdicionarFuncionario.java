package br.edu.unijuazeiro.petshop.App.Funcionario;

import br.edu.unijuazeiro.petshop.DAO.FuncionarioDAO;
import br.edu.unijuazeiro.petshop.model.Funcionario;

public class AdicionarFuncionario {
    public static void main(String[] args) {

        FuncionarioDAO dao = new FuncionarioDAO();

        Funcionario f = new Funcionario();
        f.setNome("Thiago");
        f.setCpf("12345678910");
        f.setTelefone("354687654342");
        f.setEmail("efksjdnfs@fdsdfsd.com");
        f.setFuncao("Zelador");
        f.setSenha("senha");
        dao.persist(f);
    }
}