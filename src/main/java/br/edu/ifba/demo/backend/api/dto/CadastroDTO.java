package br.edu.ifba.demo.backend.api.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.edu.ifba.demo.backend.api.model.CadastroModel;

public class CadastroDTO {

    private long id_cadastro;
    private String nome_cadastro;
    private String email_cadastro;
    private String senha_cadastro;
    private String cpf_cadastro;
    private LocalDateTime data_cadastros;

    public static CadastroDTO converter(CadastroModel cadastroModel){

        var cadastro = new CadastroDTO();
        cadastro.setId_cadastro(cadastroModel.getId_cadastro());
        cadastro.setNome_cadastro(cadastroModel.getNome_cadastro());
        cadastro.setEmail_cadastro(cadastroModel.getEmail_cadastro());
        cadastro.setSenha_cadastro(cadastroModel.getSenha_cadastro());
        cadastro.setCpf_cadastro(cadastroModel.getCpf_cadastro());
        cadastro.setData_cadastros(cadastroModel.getData_cadastros());
        return cadastro;

    }

    public static List<CadastroDTO> converter(List<CadastroModel> cadastro){
        List<CadastroDTO> list = new ArrayList<>();
        for (CadastroModel model : cadastro){

            list.add(CadastroDTO.converter(model));

        }

        return list;
    }

    public CadastroDTO(){

        super();

    }

    public CadastroDTO(long id_cadastro, String nome_cadastro, String email_cadastro,
    String senha_cadastro, String cpf_cadastro, LocalDateTime data_cadastros){

        super();
        this.id_cadastro = id_cadastro;
        this.nome_cadastro = nome_cadastro;
        this.email_cadastro = email_cadastro;
        this.senha_cadastro = senha_cadastro;
        this.cpf_cadastro = cpf_cadastro;
        this.data_cadastros = data_cadastros;

    }

    public long getId_cadastro() {
        return id_cadastro;
    }

    public void setId_cadastro(long id_cadastro) {
        this.id_cadastro = id_cadastro;
    }

    public String getNome_cadastro() {
        return nome_cadastro;
    }

    public void setNome_cadastro(String nome_cadastro) {
        this.nome_cadastro = nome_cadastro;
    }

    public String getEmail_cadastro() {
        return email_cadastro;
    }

    public void setEmail_cadastro(String email_cadastro) {
        this.email_cadastro = email_cadastro;
    }

    public String getSenha_cadastro() {
        return senha_cadastro;
    }

    public void setSenha_cadastro(String senha_cadastro) {
        this.senha_cadastro = senha_cadastro;
    }

    public String getCpf_cadastro() {
        return cpf_cadastro;
    }

    public void setCpf_cadastro(String cpf_cadastro) {
        this.cpf_cadastro = cpf_cadastro;
    }

    public LocalDateTime getData_cadastros() {
        return data_cadastros;
    }

    public void setData_cadastros(LocalDateTime data_cadastros) {
        this.data_cadastros = data_cadastros;
    }

    
}
