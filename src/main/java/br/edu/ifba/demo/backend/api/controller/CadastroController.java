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
@RequestMapping("/Cadastro")
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
        Optional<CadastroModel> cadastro = cadastroRepository.findById(id);
        return cadastro.map(l -> ResponseEntity.ok(new CadastroDTO(l)))
                        .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Método para consultar livro por nome
    @GetMapping("/findByNome/{nome}")
    public ResponseEntity<CadastroDTO> findByNome(@PathVariable("nomeCadastro") String nomeCadastro) {
        Optional<CadastroModel> cadastro = CadastroRepository.findByNome(nome);
        return nome.map(l -> ResponseEntity.ok(new CadastroDTO(l)))
                    .orElseGet(() -> ResponseEntity.notFound().build());
    }
    
    @GetMapping("/findByCpf/{cpf}")
    public ResponseEntity<CadastroDTO> findByCpf(@PathVariable("cpf") String cpfCadastro) {
        Optional<CadastroModel> cadastro = CadastroRepository.findByCpf(cpf);
        return nome.map(l -> ResponseEntity.ok(new CadastroDTO(l)))
                    .orElseGet(() -> ResponseEntity.notFound().build());
    }
    
    
    
}
