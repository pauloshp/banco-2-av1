package br.edu.unijuazeiro.petshop.App.Produto;

import br.edu.unijuazeiro.petshop.DAO.ProdutoDAO;
import br.edu.unijuazeiro.petshop.model.Negocios.Produto;

public class AtualizarProduto {
    public static void main(String[] args) {

         ProdutoDAO dao = new ProdutoDAO();
         
         Produto p = dao.findId(2);
         p.setNome("");
         p.setValor(57.0);         
         dao.merge(p);
     }
}