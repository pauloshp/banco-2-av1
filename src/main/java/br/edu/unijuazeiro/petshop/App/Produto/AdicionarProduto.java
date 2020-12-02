package br.edu.unijuazeiro.petshop.App.Produto;

import br.edu.unijuazeiro.petshop.DAO.ProdutoDAO;
import br.edu.unijuazeiro.petshop.model.Produto;

public class AdicionarProduto {
    public static void main(String[] args) {

        ProdutoDAO dao = new ProdutoDAO();

        Produto p = new Produto();
        p.setNome("Ração sabor carne");
        p.setMarca("Whiskas");
        p.setValor(25.0);
        dao.persist(p);
    }
}