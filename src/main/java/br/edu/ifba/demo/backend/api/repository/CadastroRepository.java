package br.edu.ifba.demo.backend.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.edu.ifba.demo.backend.api.model.CadastroModel;
import java.util.List;


@Repository
public interface CadastroRepository 
extends JpaRepository<CadastroModel, Long>{

} 