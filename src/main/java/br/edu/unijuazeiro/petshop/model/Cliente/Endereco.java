package br.edu.unijuazeiro.petshop.model.Cliente;

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

public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_endereco")
    @SequenceGenerator(sequenceName = "seq_endereco", allocationSize = 1, initialValue = 1, name = "gen_endereco")
   
    private Integer codigo;
    private String rua;
    private Integer numero;
    private String CEP;
    private String estado;
    private String cidade;
}