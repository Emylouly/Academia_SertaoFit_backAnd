package br.edu.ifba.demo.backend.api.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cadastro")
public class CadastroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCadastro;

    @Column(name = "nome_cadastro", nullable = false)
    private String nomeCadastro;

    @Column(name = "email_cadastro", nullable = false, unique = true)
    private String emailCadastro;

    @Column(name = "senha_cadastro", nullable = false)
    private String senhaCadastro;

    @Column(name = "cpf_cadastro", nullable = false, unique = true)
    private String cpfCadastro;

    @Column(name = "data_cadastro")
    private LocalDateTime dataCadastro = LocalDateTime.now();

    // Getters e Setters
    public Integer getIdCadastro() {
        return idCadastro;
    }

    public void setIdCadastro(Integer idCadastro) {
        this.idCadastro = idCadastro;
    }

    public String getNomeCadastro() {
        return nomeCadastro;
    }

    public void setNomeCadastro(String nomeCadastro) {
        this.nomeCadastro = nomeCadastro;
    }

    public String getEmailCadastro() {
        return emailCadastro;
    }

    public void setEmailCadastro(String emailCadastro) {
        this.emailCadastro = emailCadastro;
    }

    public String getSenhaCadastro() {
        return senhaCadastro;
    }

    public void setSenhaCadastro(String senhaCadastro) {
        this.senhaCadastro = senhaCadastro;
    }

    public String getCpfCadastro() {
        return cpfCadastro;
    }

    public void setCpfCadastro(String cpfCadastro) {
        this.cpfCadastro = cpfCadastro;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}