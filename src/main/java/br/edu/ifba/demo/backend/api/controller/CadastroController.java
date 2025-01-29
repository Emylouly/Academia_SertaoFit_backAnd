package br.edu.ifba.demo.backend.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifba.demo.backend.api.dto.CadastroDTO;
import br.edu.ifba.demo.backend.api.model.CadastroModel;
import br.edu.ifba.demo.backend.api.repository.CadastroRepository;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/cadastro")
public class CadastroController {

    private CadastroRepository cadastroRepository;

    public CadastroController(CadastroRepository cadastroRepository){
        this.cadastroRepository = cadastroRepository;
    }

    @GetMapping
    public String teste(){

        return "Testando rota";

    }

    @GetMapping("/listall")
    public List<CadastroDTO> listall() {
        var cadastro = cadastroRepository.findAll();
        return CadastroDTO.converter(cadastro);
    }

    
    
}
