package com.everton.read_panel.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everton.read_panel.entity.Cadastro;
import com.everton.read_panel.service.CadastroService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/cadastro")
public class CadastroController {

	private final CadastroService cadastroService;
	public CadastroController(CadastroService cadastroService) {
		this.cadastroService = cadastroService;
	}
	public CadastroService getCadastroService()	{
		return cadastroService;
	}
	
	@PostMapping
	public ResponseEntity<Cadastro> create(@RequestBody Cadastro cadastro){
		Cadastro cad = cadastroService.salvar(cadastro);
		return ResponseEntity.status(HttpStatus.CREATED).body(cad);
	}
	
	@GetMapping("/id")
	public ResponseEntity<Cadastro> buscarId(@RequestBody Long id){
		Cadastro cad = cadastroService.buscarPorId(id);
		return ResponseEntity.ok(cad);
	}
	
	
}
