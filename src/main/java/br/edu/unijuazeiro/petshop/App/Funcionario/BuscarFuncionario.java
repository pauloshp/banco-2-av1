package br.edu.unijuazeiro.petshop.App.Funcionario;

import br.edu.unijuazeiro.petshop.DAO.FuncionarioDAO;
import br.edu.unijuazeiro.petshop.model.Negocios.Funcionario;

public class BuscarFuncionario {
    public static void main(String[] args) {

        FuncionarioDAO dao = new FuncionarioDAO();

        Funcionario f = dao.findId(1);
        System.out.println("Id: " + f.getCodigo());
        System.out.println("Nome: " + f.getNome());
        System.out.println("E-mail: " + f.getEmail());
        System.out.println("CPF: " + f.getCpf());
        System.out.println("Função: " + f.getFuncao());
        System.out.println("Telefone: " + f.getTelefone());
    }
}