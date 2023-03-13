package br.com.isidrocorp.loja.services;

import java.util.ArrayList;

import br.com.isidrocorp.loja.model.Produto;

public interface IProdutoService {
public ArrayList<Produto> recuperarTodos();
public Produto cadastrarNovoProduto(Produto novo);
public Produto recuperarPeloCodigo(int codigo);

} // IProdutoService
