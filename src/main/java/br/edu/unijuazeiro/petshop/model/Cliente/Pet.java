package br.edu.unijuazeiro.petshop.model.Cliente;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Pet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_pet")
    @SequenceGenerator(sequenceName = "seq_pet", allocationSize = 1, initialValue = 1, name = "gen_pet")
    private Integer codigo;

    private String nome;
    
    private String raca;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(nullable = false)
    private Cliente cliente;
}
