package br.edu.ifba.demo.backend.api.controller;

import br.edu.ifba.demo.backend.api.dto.CadastroDTO;
import br.edu.ifba.demo.backend.api.dto.LivroDTO;
import br.edu.ifba.demo.backend.api.model.CadastroModel;
import br.edu.ifba.demo.backend.api.model.LivroModel;
import br.edu.ifba.demo.backend.api.repository.CadastroRepository;
import br.edu.ifba.demo.backend.api.repository.LivroRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/Cadatro")
public class CadastroController {

    private final CadastroRepository cadastroRepository;

    public CadastroController(CadastroRepository cadastroRepository){
        this.cadastroRepository = cadastroRepository;
    }

    @GetMapping
    public String teste() {
		return "Testando rota Cadastro";
    }

    @GetMapping("/listAll")
    public List<CadastroModel> listAll() {
        return cadastroRepository.findAll();
    }
    
    @GetMapping("/findById/{id}")
    public ResponseEntity<CadastroDTO> findById(@PathVariable("id") Long id) {
        Optional<CadastroModel> 
        return ;
    }
    
    
    
}
