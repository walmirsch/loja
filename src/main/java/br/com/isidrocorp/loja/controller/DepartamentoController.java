package br.com.isidrocorp.loja.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.loja.dto.MensagemErro;
import br.com.isidrocorp.loja.model.Departamento;
import br.com.isidrocorp.loja.services.IDepartamentoService;

@RestController
public class DepartamentoController {
	
	@Autowired
	private IDepartamentoService service;
	
	@GetMapping("/departamentos")
	public ArrayList<Departamento> recuperarTodos(){
		return service.recuperarTodos();
	}
	
	@GetMapping("/departamentos/{codigo}")
	public ResponseEntity<?> recuperarPeloCodigo(@PathVariable int codigo){
		Departamento d = service.recuperarPeloCodigo(codigo);
		if (d != null) {
			return ResponseEntity.ok(d);
		}
		return ResponseEntity.status(404).body(new MensagemErro(1234,"Departamento nao encontrado"));
	}

	
	@PostMapping("/departamentos")
	public ResponseEntity<?> inserirDepartamento(@RequestBody Departamento novo){
		Departamento res = service.cadastrarNovo(novo);
		if (res != null) {
			return ResponseEntity.status(201).body(res);
		}
		return ResponseEntity.badRequest().body(new MensagemErro(9876, "Erro ao criar departamento"));
	}
}