package br.edu.unijuazeiro.petshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_funcionario")
    @SequenceGenerator(sequenceName = "seq_funcionario", allocationSize = 1, initialValue = 1, name = "gen_funcionario")
   
    private Integer codigo;
    private String nome;
    private String email;

    private String senha;

    @Column(unique=true)
    private String cpf;
    
    private String funcao;
    private String telefone;
    
    @OneToOne
    @JoinColumn(nullable = true)
    private Endereco endereco;
}