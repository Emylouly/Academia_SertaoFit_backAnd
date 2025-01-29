package br.edu.ifba.demo.backend.api.controller;

import br.edu.ifba.demo.backend.api.dto.CadastroDTO;
import br.edu.ifba.demo.backend.api.model.CadastroModel;
import br.edu.ifba.demo.backend.api.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/cadastro")
public class CadastroController {

    private final CadastroRepository cadastroRepository;

    @Autowired
    public CadastroController(CadastroRepository cadastroRepository) {
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


    @GetMapping("/{id}")
    public Optional<CadastroModel> findById(@PathVariable Long id) {
        return cadastroRepository.findById(id);
    }

    @PostMapping("/save")
    public CadastroModel save(@RequestBody CadastroModel cadastro) {
        return cadastroRepository.save(cadastro);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        cadastroRepository.deleteById(id);
    }
}
