package br.edu.unijuazeiro.petshop.App.Funcionario;

import br.edu.unijuazeiro.petshop.DAO.Conexao.ConexaoFabrica;
import java.util.List;
import br.edu.unijuazeiro.petshop.DAO.FuncionarioDAO;
import br.edu.unijuazeiro.petshop.Services.LoginFuncionario;
import br.edu.unijuazeiro.petshop.model.Funcionario;

public final class ExecutarLogin {

    private ExecutarLogin() {
    }

    public static void main(String[] args) {

        LoginFuncionario loginFuncionario = new LoginFuncionario();
        System.out.println(loginFuncionario.login(3, "3456"));

        ConexaoFabrica.close();
    }
}
    /* 
        System.out.println("> " + f.getSenha());
        try {
            f.setSenha("3456");
            System.out.println("> " + f.getSenha());
            loginFuncionario.update(f);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
} */
// });

/*
 * LoginFuncionario loginFuncionario = new LoginFuncionario();
 * 
 * FuncionarioDAO dao = new FuncionarioDAO(); Funcionario f = dao.findId(2); if
 * (f != null) { System.out.println(f.getNome());
 * System.out.println(f.getEmail()); } List<Funcionario> funcionarios =
 * loginFuncionario.list(); funcionarios.forEach(c -> {
 * System.out.println(c.getCodigo()); System.out.println(c.getNome());
 * System.out.println(c.getEmail()); });
 * 
 * System.out.println("> " + f.getSenha()); try { f.setSenha("3456");
 * System.out.println("> " + f.getSenha()); loginFuncionario.update(f); } catch
 * (Exception e) { System.out.println(e.getMessage()); } }
 */
/*
 * System.out.println(loginFuncionario.login(2, "senha"));
 * 
 * ConexaoFabrica.close(); }
 */

// }

