package br.com.isidrocorp.loja.services;

import java.util.ArrayList;

import br.com.isidrocorp.loja.model.Cliente;

public interface IClienteService {
public ArrayList<Cliente> recuperarTodos();
public Cliente recuperarPeloCodigo(int codigo);
public ArrayList<Cliente> recuperarPeloNome(String palavra);
public Cliente adicionarNovo(Cliente novo);
public Cliente atualizarDados(Cliente cli);
public boolean excluirCliente(int codigo);
} // IClienteService
