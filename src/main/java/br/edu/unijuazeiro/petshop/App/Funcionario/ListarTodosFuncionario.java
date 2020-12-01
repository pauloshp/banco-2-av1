package br.edu.unijuazeiro.petshop.App.Funcionario;

import java.util.List;

import br.edu.unijuazeiro.petshop.DAO.FuncionarioDAO;
import br.edu.unijuazeiro.petshop.model.Funcionario;

public class ListarTodosFuncionario {
    public static void main(String[] args) {

         FuncionarioDAO dao = new FuncionarioDAO();

         List<Funcionario> funcio = dao.listAll();
         for (Funcionario funcionario : funcio) {
            System.out.println("Id: " + funcionario.getCodigo());
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("E-mail: " + funcionario.getEmail());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("Função: " + funcionario.getFuncao());
            System.out.println("Telefone: " + funcionario.getTelefone());
            System.out.println("Endereço: " + funcionario.getEndereco());
        }
    }
}