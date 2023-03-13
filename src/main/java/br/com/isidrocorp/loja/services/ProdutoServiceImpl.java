package br.com.isidrocorp.loja.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.isidrocorp.loja.model.Produto;
import br.com.isidrocorp.loja.repo.ProdutoRepo;

@Component
public class ProdutoServiceImpl implements IProdutoService{
	
	@Autowired
	private ProdutoRepo repo;

	@Override
	public ArrayList<Produto> recuperarTodos() {
		// TODO Auto-generated method stub
		return (ArrayList<Produto>)repo.findAll();
	}

	@Override
	public Produto cadastrarNovoProduto(Produto novo) {
		// TODO Auto-generated method stub
		return repo.save(novo);
	}

	@Override
	public Produto recuperarPeloCodigo(int codigo) {
		// TODO Auto-generated method stub
		return repo.findById(codigo).orElse(null);
	}

	
}