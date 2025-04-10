package com.everton.read_panel.service;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.everton.read_panel.entity.Cadastro;
import com.everton.read_panel.repository.CadastroRepository;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CadastroService {

	private final CadastroRepository cadastroRepository;
	public CadastroService(CadastroRepository cadastroRepository) {
		this.cadastroRepository = cadastroRepository;
	}
	public CadastroRepository getCadastroRepository() {
		return cadastroRepository;
	}
	

	
	@Transactional
	public Cadastro salvar (Cadastro cadastro) {
		return cadastroRepository.save(cadastro);
		
	}
	
	@Transactional(readOnly = true)
	public Cadastro buscarPorId(Long id) {
		return cadastroRepository.findById(id).orElseThrow( () -> new RuntimeException("Cadastro não encontrado"));
	}
	
	@Transactional(readOnly = true)
	public List<Cadastro> listar() {
		return cadastroRepository.findAll();
	}
	

}
