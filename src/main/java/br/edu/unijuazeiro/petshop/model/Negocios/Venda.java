package br.edu.unijuazeiro.petshop.model.Negocios;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_venda")
    @SequenceGenerator(sequenceName = "seq_venda", allocationSize = 1, initialValue = 1, name = "gen_venda")
    private Integer codigo;

    private Double valorTotal;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date criadoEm;
    
    @OneToMany
    private List<Item> items;

    public void sumTotal() {
        valorTotal = 0.0;
        for (Item item : items) {
            try {
                valorTotal += item.getQuantidade() * item.getProduto().getValor();
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    } 
}