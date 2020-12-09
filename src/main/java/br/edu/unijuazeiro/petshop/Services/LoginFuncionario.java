package br.edu.unijuazeiro.petshop.Services;

import br.edu.unijuazeiro.petshop.DAO.Conexao.ConexaoFabrica;
import br.edu.unijuazeiro.petshop.DAO.FuncionarioDAO;
import br.edu.unijuazeiro.petshop.model.Negocios.Funcionario;

public final class LoginFuncionario {

    private LoginFuncionario() {
    }

    public static void main(String[] args) {

        CifrandoSenha cifrandoSenha = new CifrandoSenha();
        FuncionarioDAO dao = new FuncionarioDAO();

        // Realiza Login do funcionario
        System.out.println(cifrandoSenha.login("email@email.com", "1232"));
        System.out.println("Login realizado com sucesso!");

        // Buscar o Funcionario pelo ID, atualizar e criptografar senha;
        Funcionario f = dao.findId(2);
        if (f != null) {
            System.out.println("Nome: " + f.getNome());
            System.out.println("Email: " + f.getEmail());
            System.out.println("> " + f.getSenha());
        }
        try {
            f.setSenha("1232");
            System.out.println("> " + f.getSenha());
            cifrandoSenha.update(f);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        ConexaoFabrica.close();

    }

}
