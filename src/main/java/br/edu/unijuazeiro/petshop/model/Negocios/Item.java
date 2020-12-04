package br.edu.unijuazeiro.petshop.model.Negocios;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_item")
    @SequenceGenerator(sequenceName = "seq_item", allocationSize = 1, initialValue = 1, name = "gen_item")
    private Integer codigo;

    @ManyToOne
    private Produto produto;
    
    private Double quantidade;

}