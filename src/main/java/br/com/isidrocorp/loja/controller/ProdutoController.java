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
import br.com.isidrocorp.loja.model.Produto;
import br.com.isidrocorp.loja.services.IProdutoService;

@RestController
public class ProdutoController {
	
	@Autowired
	private IProdutoService service;
	
	
	@GetMapping("/produtos")
	public ArrayList<Produto> recuperarTodos(){
//		return (ArrayList<Produto>) repo.findAll();
		return service.recuperarTodos();
	}
	
	@GetMapping("/produtos/{codigo}")
	public ResponseEntity<Produto> recuperarPeloCodigo(@PathVariable int codigo){
		Produto p = service.recuperarPeloCodigo(codigo);
		if (p != null) {
			return ResponseEntity.ok(p);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping("/produtos")
	public ResponseEntity<?> adicionarProduto(@RequestBody Produto novo){
		Produto res = service.cadastrarNovoProduto(novo);
		if (res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.badRequest().body(new MensagemErro(9876,"Erro ao cadastrar Produto"));
	}
}