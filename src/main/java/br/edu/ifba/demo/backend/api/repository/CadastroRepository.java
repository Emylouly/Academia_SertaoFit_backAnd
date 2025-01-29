package br.edu.ifba.demo.backend.api.repository;
<<<<<<< Updated upstream
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
=======

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.edu.ifba.demo.backend.api.model.CadastroModel;
import java.util.List;


@Repository
public interface CadastroRepository 
extends JpaRepository<CadastroModel, Long>{

} 
>>>>>>> Stashed changes
