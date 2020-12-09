package br.edu.unijuazeiro.petshop.model.Negocios;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.edu.unijuazeiro.petshop.model.Cliente.Cliente;
import br.edu.unijuazeiro.petshop.model.Cliente.Pet;
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

    private String tipo;

    @Temporal(TemporalType.TIMESTAMP)
    private Date criadoEm;

    private Double valor;

    @OneToOne
    private Cliente cliente;

    @OneToOne
    private Funcionario funcionario;
    
    @OneToOne
    private Pet pet;

}