package br.edu.ifba.demo.backend.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifba.demo.backend.api.dto.CadastroDTO;
import br.edu.ifba.demo.backend.api.model.CadastroModel;
import br.edu.ifba.demo.backend.api.repository.CadastroRepository;


@RestController
@RequestMapping("/cadastro")
public class CadastroController {

    @Autowired
    private CadastroRepository cadastroRepository;

    @GetMapping("/listall")
    public ResponseEntity<?> listarTodosCadastros() {
        return ResponseEntity.ok(cadastroRepository.findAll());
    }

    @GetMapping("/procurarporid/{id}")
    public ResponseEntity<?> obterCadastro1(@PathVariable Integer id) {
        Optional<CadastroModel> cadastro = cadastroRepository.findById(id);
        return cadastro.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/procurarpornome/{nome}")
    public ResponseEntity<?> obterCadastro2(@PathVariable String nome) {
        Optional<CadastroModel> cadastro = cadastroRepository.findByNomeCadastro(nome);
        return cadastro.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/procurarporemail/{email}")
    public ResponseEntity<?> obterCadastro3(@PathVariable String email) {
        Optional<CadastroModel> cadastro = cadastroRepository.findByEmailCadastro(email);
        return cadastro.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/procurarporcpf/{cpf}")
    public ResponseEntity<?> obterCadastro4(@PathVariable String cpf) {
        Optional<CadastroModel> cadastro = cadastroRepository.findByCpfCadastro(cpf);
        return cadastro.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/criar")
    public ResponseEntity<String> criarCadastro(@RequestBody CadastroDTO cadastroDTO) {
        if (cadastroRepository.findByEmailCadastro(cadastroDTO.getEmailCadastro()).isPresent()) {
            return ResponseEntity.badRequest().body("Erro: Email já cadastrado!");
        }
        if (cadastroRepository.findByCpfCadastro(cadastroDTO.getCpfCadastro()).isPresent()) {
            return ResponseEntity.badRequest().body("Erro: CPF já cadastrado!");
        }

        CadastroModel novoCadastro = new CadastroModel();
        novoCadastro.setNomeCadastro(cadastroDTO.getNomeCadastro());
        novoCadastro.setEmailCadastro(cadastroDTO.getEmailCadastro());
        novoCadastro.setSenhaCadastro(cadastroDTO.getSenhaCadastro());
        novoCadastro.setCpfCadastro(cadastroDTO.getCpfCadastro());

        cadastroRepository.save(novoCadastro);
        return ResponseEntity.ok("Cadastro criado com sucesso!");
    }


}