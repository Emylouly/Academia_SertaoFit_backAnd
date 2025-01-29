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

    @Column(name = "nomeCadastro", nullable = false)
    private String nomeCadastro;

    @Column(name = "emailCadastro", nullable = false)
    private String emailCadastro;

    @Column(name = "senhaCadastro", nullable = false)
    private String senhaCadastro;

    @Column(name = "cpfCadastro", nullable = false)
    private String cpfCadastro;

    @Column(name = "data_cadastro", nullable = false)
    private LocalDateTime dataCadastro;
}
