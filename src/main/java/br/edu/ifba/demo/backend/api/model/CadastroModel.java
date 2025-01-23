package br.edu.ifba.demo.backend.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "cadastro")
public class CadastroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCadastro")
    private Long idCadastro;

    @Column(name = "nomeCadastro")
    private String nomeCadastro;

    @Column(name = "emailCadastro")
    private String emailCadastro;

    @Column(name = "senhaCadastro")
    private String senhaCadastro;

    @Column(name = "cpfCadastro")
    private String cpfCadastro;

    @Column(name = "data_cadastro")
    private LocalDateTime data_cadastro;

}
