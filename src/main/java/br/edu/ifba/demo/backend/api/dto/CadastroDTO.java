package br.edu.ifba.demo.backend.api.dto;

import br.edu.ifba.demo.backend.api.model.CadastroModel;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CadastroDTO implements Serializable {

    private Long idCadastro;
    private String nomeCadastro;
    private String emailCadastro;
    private String senhaCadastro;
    private String cpfCadastro;
    private LocalDateTime dataCadastro;

    public static CadastroDTO converter(CadastroModel cadastroModel) {
        var cadastro = new CadastroDTO();
        cadastro.setIdCadastro(cadastroModel.getIdCadastro());
        cadastro.setNomeCadastro(cadastroModel.getNomeCadastro());
        cadastro.setEmailCadastro(cadastroModel.getEmailCadastro());
        cadastro.setSenhaCadastro(cadastroModel.getSenhaCadastro());
        cadastro.setCpfCadastro(cadastroModel.getCpfCadastro());
        cadastro.setDataCadastro(cadastroModel.getDataCadastro());
        return cadastro;
    }

    public static List<CadastroDTO> converter(List<CadastroModel> cadastros) {
        List<CadastroDTO> list = new ArrayList<>();
        for (CadastroModel model : cadastros) {
            list.add(CadastroDTO.converter(model));
        }
        return list;
    }

    public CadastroDTO() {
        super();
    }

    public CadastroDTO(Long idCadastro, String nomeCadastro, String emailCadastro,
                        String senhaCadastro, String cpfCadastro, LocalDateTime dataCadastro) {
        this.idCadastro = idCadastro;
        this.nomeCadastro = nomeCadastro;
        this.emailCadastro = emailCadastro;
        this.senhaCadastro = senhaCadastro;
        this.cpfCadastro = cpfCadastro;
        this.dataCadastro = dataCadastro;
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
        return dataCadastro;
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

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
