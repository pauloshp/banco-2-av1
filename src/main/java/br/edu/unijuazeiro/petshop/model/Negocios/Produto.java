package br.edu.unijuazeiro.petshop.model.Negocios;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_produto")
    @SequenceGenerator(sequenceName = "seq_produto", allocationSize = 1, initialValue = 1, name = "gen_produto")
    private Integer codigo;

    private String nome;

    private Double valor;

}