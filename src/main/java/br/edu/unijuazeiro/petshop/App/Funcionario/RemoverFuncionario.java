package br.edu.unijuazeiro.petshop.App.Funcionario;

import br.edu.unijuazeiro.petshop.DAO.FuncionarioDAO;
import br.edu.unijuazeiro.petshop.model.Funcionario;

public class RemoverFuncionario {
    public static void main(String[] args) {


        FuncionarioDAO dao = new FuncionarioDAO();

        Funcionario f = dao.findId(5);
        System.out.println("Id: " + f.getCodigo());
        System.out.println("Nome: " + f.getNome());
        System.out.println("CPF: " + f.getCpf());
        dao.remove(f);
    }
}