package br.edu.unijuazeiro.petshop.Services;

import at.favre.lib.crypto.bcrypt.BCrypt;
import br.edu.unijuazeiro.petshop.DAO.FuncionarioDAO;
import br.edu.unijuazeiro.petshop.model.Negocios.Funcionario;

public class CifrandoSenha {

    private FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

    public void save(Funcionario funcionario) {
        if (funcionario.getNome().length() > 30) {
        }
        funcionarioDAO.persist(funcionario);
    }

    public void update(Funcionario funcionario) {
        if (funcionario.getSenha() == null) {
            throw new RuntimeException("Senha obrigatória");
        }
        String senhaCifrada = BCrypt.withDefaults().hashToString(11, funcionario.getSenha().toCharArray());
        System.out.println(senhaCifrada);
        funcionario.setSenha(senhaCifrada);
        funcionarioDAO.merge(funcionario);
    }

    public Funcionario login(String email, String senha) {
        Funcionario f = funcionarioDAO.findByEmail(email);
        if (f == null) {
            throw new RuntimeException("Preencha os Campos!");
        }
        if (!BCrypt.verifyer().verify(senha.toCharArray(), f.getSenha().toCharArray()).verified) {
            throw new RuntimeException("Dados inválidos");
        }
        return f;
    }

}