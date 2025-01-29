package br.edu.ifba.demo.backend.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifba.demo.backend.api.model.CadastroModel;


public interface CadastroRepository extends JpaRepository<CadastroModel, Integer> {
    Optional<CadastroModel> findByNomeCadastro(String nomeCadastro);
    Optional<CadastroModel> findByEmailCadastro(String emailCadastro);
    Optional<CadastroModel> findByCpfCadastro(String cpfCadastro);
}