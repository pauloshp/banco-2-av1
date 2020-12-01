package br.edu.unijuazeiro.petshop.App.Funcionario;

import br.edu.unijuazeiro.petshop.DAO.FuncionarioDAO;
import br.edu.unijuazeiro.petshop.model.Funcionario;

public class AtualizarFuncionario {
    public static void main(String[] args) {

         FuncionarioDAO dao = new FuncionarioDAO();
         
         Funcionario f = dao.findId(4);
         f.setNome("");
         f.setCpf("");
         f.setEmail("");
         f.setTelefone("");
         f.setFuncao("");
         //f.setEndereco(endereco);
         dao.merge(f);
     }
}