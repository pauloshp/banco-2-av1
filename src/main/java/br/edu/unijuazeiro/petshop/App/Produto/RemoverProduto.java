package br.edu.unijuazeiro.petshop.App.Produto;

import br.edu.unijuazeiro.petshop.DAO.ProdutoDAO;
import br.edu.unijuazeiro.petshop.model.Produto;

public class RemoverProduto {
    public static void main(String[] args) {



         ProdutoDAO dao = new ProdutoDAO();
         
         Produto p = dao.findId(1);
         System.out.println("Id: " + p.getCodigo());
         System.out.println("Nome: " + p.getNome());
         System.out.println("Marca: " + p.getMarca());
         System.out.println("Valor: " + p.getValor());
        dao.remove(p);
    }
}