package br.edu.unijuazeiro.petshop.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_servico")
    @SequenceGenerator(sequenceName = "seq_servico", allocationSize = 1, initialValue = 1, name = "gen_servico")
   
    private Integer codigo;
    private String nome;
    private Date data;
    private Double valor;
    private String tipo;

    @OnDelete(action = OnDeleteAction.CASCADE)
    @OneToOne
    private Cliente cliente;
    //private Funcionario funcionario;
    //private Pet pet;
}