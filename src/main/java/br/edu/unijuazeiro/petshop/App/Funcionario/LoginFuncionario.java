package br.edu.unijuazeiro.petshop.App.Funcionario;

import br.edu.unijuazeiro.petshop.DAO.Conexao.ConexaoFabrica;
import java.util.List;
import br.edu.unijuazeiro.petshop.DAO.FuncionarioDAO;
import br.edu.unijuazeiro.petshop.Services.FuncionarioLogin;
import br.edu.unijuazeiro.petshop.model.Negocios.Funcionario;

public final class LoginFuncionario {

    private LoginFuncionario() {
    }

    public static void main(String[] args) {

        FuncionarioLogin funcionariologin = new FuncionarioLogin();
        FuncionarioDAO dao = new FuncionarioDAO();

        // Realiza Login
        // FuncionarioLogin Funcionariologin = new FuncionarioLogin();
        // System.out.println(Funcionariologin.login(3, "3456"));

        // ConexaoFabrica.close();

        // Busca Funcionario pelo ID
        Funcionario f = dao.findId(1);
        if (f != null) {
            System.out.println("Nome: " + f.getNome());
            System.out.println("Email: " + f.getEmail());
            System.out.println("> " + f.getSenha());
        }
        // Atualiza e Criptografa senha
        try {
            f.setSenha("3456");
            System.out.println("> " + f.getSenha());
            funcionariologin.update(f);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Lista todos os funcionarios
        // List<Funcionario> funcionarios = funcionariologin.list();
        // funcionarios.forEach(c -> {
        //     System.out.println(c.getCodigo());
        //     System.out.println(c.getNome());
        //     System.out.println(c.getEmail());
        // });

    }

}
