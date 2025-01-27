package br.edu.ifba.demo.backend.api.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import br.edu.ifba.demo.backend.api.model.CadastroModel;

@Repository
public interface CadastroRepository extends JpaRepository<CadastroModel, Long>
{
    
    Optional<CadastroModel> findByNome(String nomeCadastro);
    Optional<CadastroModel> findByCpf(String cpfCadastro);
    Optional<CadastroModel> findByEmail(String emailCadastro);


}
