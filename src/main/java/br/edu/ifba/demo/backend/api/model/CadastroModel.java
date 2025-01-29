package br.edu.ifba.demo.backend.api.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "cadastro")
public class CadastroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cadastro")
    private long id_cadastro;

    @Column(name = "nome_cadastro", nullable = false)
    private String nome_cadastro;

    @Column(name = "email_cadastro", nullable = false)
    private String email_cadastro;

    @Column(name = "senha_cadastro", nullable = false)
    private String senha_cadastro;

    @Column(name = "cpf_cadastro", nullable = false)
    private String cpf_cadastro;

    @Column(name = "data_cadastro")
    private LocalDateTime data_cadastros;

    public CadastroModel(){
        super();
    }

    public CadastroModel(long id_cadastro, String nome_cadastro, String email_cadastro,
    String senha_cadastro, String cpf_cadastro, LocalDateTime data_cadastros){

        super();
        this.id_cadastro = id_cadastro;
        this.nome_cadastro = nome_cadastro;
        this.email_cadastro = email_cadastro;
        this.senha_cadastro = senha_cadastro;
        this.cpf_cadastro = cpf_cadastro;
        this.data_cadastros = data_cadastros;

    }
    
}
