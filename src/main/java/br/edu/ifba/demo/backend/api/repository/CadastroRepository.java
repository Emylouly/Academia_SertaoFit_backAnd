package br.edu.ifba.demo.backend.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.edu.ifba.demo.backend.api.model.CadastroModel;

import java.util.Optional;

@Repository
public interface CadastroRepository extends JpaRepository<CadastroModel, Long> {

    Optional<CadastroModel> findByNomeCadastro(String nomeCadastro);

    Optional<CadastroModel> findByCpfCadastro(String cpfCadastro);

    Optional<CadastroModel> findByEmailCadastro(String emailCadastro);
}
