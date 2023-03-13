package br.com.isidrocorp.loja.services;

import java.util.ArrayList;

import br.com.isidrocorp.loja.model.Departamento;

public interface IDepartamentoService {
public ArrayList<Departamento> recuperarTodos();
public Departamento recuperarPeloCodigo(int codigo);
public Departamento cadastrarNovo(Departamento novo);
} // IDepartamentoService
