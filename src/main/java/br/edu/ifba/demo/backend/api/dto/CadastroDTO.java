package br.edu.ifba.demo.backend.api.dto;

public class CadastroDTO {

    private String nomeCadastro;
    private String emailCadastro;
    private String senhaCadastro;
    private String cpfCadastro;

    public CadastroDTO(String nomeCadastro, String emailCadastro, String senhaCadastro, String cpfCadastro) {
        this.nomeCadastro = nomeCadastro;
        this.emailCadastro = emailCadastro;
        this.senhaCadastro = senhaCadastro;
        this.cpfCadastro = cpfCadastro;
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
}
