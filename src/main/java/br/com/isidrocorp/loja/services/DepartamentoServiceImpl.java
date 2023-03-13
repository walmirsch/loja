package br.com.isidrocorp.loja.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.isidrocorp.loja.model.Departamento;
import br.com.isidrocorp.loja.repo.DepartamentoRepo;

@Component
public class DepartamentoServiceImpl implements IDepartamentoService{
	
	@Autowired
	private DepartamentoRepo repo;

	@Override
	public ArrayList<Departamento> recuperarTodos() {
		// TODO Auto-generated method stub
		return (ArrayList<Departamento>)repo.findAll();
	}

	@Override
	public Departamento recuperarPeloCodigo(int codigo) {
		// TODO Auto-generated method stub
		return repo.findById(codigo).orElse(null);
	}

	@Override
	public Departamento cadastrarNovo(Departamento novo) {
		// TODO Auto-generated method stub
		return repo.save(novo);
	}

}