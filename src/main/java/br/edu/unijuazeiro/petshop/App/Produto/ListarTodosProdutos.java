package br.edu.unijuazeiro.petshop.App.Produto;

import java.util.List;

import br.edu.unijuazeiro.petshop.DAO.ProdutoDAO;
import br.edu.unijuazeiro.petshop.model.Negocios.Produto;

public class ListarTodosProdutos {
    public static void main(String[] args) {

        
        ProdutoDAO dao = new ProdutoDAO();

        List<Produto> produtos = dao.listAll();
        for (Produto produto : produtos) {
           System.out.println("Id: " + produto.getCodigo());
           System.out.println("Nome: " + produto.getNome());
           System.out.println("Valor: " + produto.getValor());
       }
    }
}