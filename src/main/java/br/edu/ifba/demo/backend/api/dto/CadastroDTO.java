package br.edu.ifba.demo.backend.api.dto;
import br.edu.ifba.demo.backend.api.model.CadastroModel;
import java.io.Serializable;
import java.time.LocalDateTime;

public class CadastroDTO implements Serializable{
    
    private Long idCadastro;
    private String nomeCadastro;
    private String emailCadastro;
    private String senhaCadastro;
    private String cpfCadastro;
    private LocalDateTime data_cadastro;

    public CadastroDTO() {
    }

    public CadastroDTO(CadastroModel cadastroModel) {
        this.idCadastro = cadastroModel.getIdCadastro();
        this.nomeCadastro = cadastroModel.getNomeCadastro();
        this.emailCadastro = cadastroModel.getEmailCadastro();
        this.senhaCadastro = cadastroModel.getSenhaCadastro();
        this.cpfCadastro = cadastroModel.getCpfCadastro();
        this.data_cadastro = cadastroModel.getData_cadastro();
    }

    public Long getIdCadastro() {
        return idCadastro;
    }

    public String getNomeCadastro() {
        return nomeCadastro;
    }

    public String getEmailCadastro() {
        return emailCadastro;
    }

    public String getSenhaCadastro() {
        return senhaCadastro;
    }

    public String getCpfCadastro() {
        return cpfCadastro;
    }

    public LocalDateTime getDataCadastro() {
        return data_cadastro;
    }

    public void setIdCadastro(Long idCadastro) {
        this.idCadastro = idCadastro;
    }

    public void setNomeCadastro(String nomeCadastro) {
        this.nomeCadastro = nomeCadastro;
    }

    public void setEmailCadastro(String emailCadastro) {
        this.emailCadastro = emailCadastro;
    }

    public void setSenhaCadastro(String senhaCadastro) {
        this.senhaCadastro = senhaCadastro;
    }

    public void setCpfCadastro(String cpfCadastro) {
        this.cpfCadastro = cpfCadastro;
    }

    public void setDataCadastro(LocalDateTime data_cadastro) {
        this.data_cadastro = data_cadastro;
    }


    
    
}
