package com.everton.read_panel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everton.read_panel.entity.*;

public interface CadastroRepository extends JpaRepository<Cadastro, Long>{
	List<Cadastro> findByTituloContainingIgnoreCase(String titulo);
}
	