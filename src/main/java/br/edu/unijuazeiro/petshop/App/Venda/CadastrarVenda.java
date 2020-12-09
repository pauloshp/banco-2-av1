package br.edu.unijuazeiro.petshop.App.Venda;

import java.util.Arrays;

import javax.persistence.EntityManager;

import br.edu.unijuazeiro.petshop.model.Negocios.Venda;
import br.edu.unijuazeiro.petshop.DAO.Conexao.ConexaoFabrica;
import br.edu.unijuazeiro.petshop.model.Negocios.Item;
import br.edu.unijuazeiro.petshop.model.Negocios.Produto;

public class CadastrarVenda {
    
    public static void main(String[] args) {
        
        EntityManager em = ConexaoFabrica.getEntityManager();

        em.getTransaction().begin();

        // Adicionar Item
        Produto p = em.find(Produto.class, 2);
        Item i = new Item();
        i.setProduto(p);
        i.setQuantidade(5.0);

        Produto p2 = em.find(Produto.class, 1);
        Item i2 = new Item();
        i2.setProduto(p2);
        i2.setQuantidade(3.0);

        // Adicionar Venda
        Item i = em.find(Item.class, 2);
        Item i2 = em.find(Item.class, 3);

        Venda v = new Venda();
        v.setItems(Arrays.asList(i, i2));
        v.sumTotal();

        em.persist(v);
        em.getTransaction().commit();
        em.close();

    }

}
