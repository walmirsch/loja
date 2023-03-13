package br.com.isidrocorp.loja.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.isidrocorp.loja.model.Cliente;
import br.com.isidrocorp.loja.repo.ClienteRepo;

@Component
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	private ClienteRepo repo;

	@Override
	public ArrayList<Cliente> recuperarTodos() {
		// TODO Auto-generated method stub
		return (ArrayList<Cliente>)repo.findAll();
	}

	@Override
	public Cliente recuperarPeloCodigo(int codigo) {
		// TODO Auto-generated method stub
		return repo.findById(codigo).orElse(null);
	}

	@Override
	public ArrayList<Cliente> recuperarPeloNome(String palavraChave) {
		// TODO Auto-generated method stub
		return repo.findByNomeContaining(palavraChave);
	}

	@Override
	public Cliente adicionarNovo(Cliente novo) {
		// TODO Auto-generated method stub
		return repo.save(novo);
	}

	@Override
	public Cliente atualizarDados(Cliente cli) {
		// TODO Auto-generated method stub
		if (cli.getCodigo() == 0) {
			return null;
		}
		return repo.save(cli);
	}

	@Override
	public boolean excluirCliente(int codigo) {
		// TODO Auto-generated method stub
		if (repo.existsById(codigo)) {
			repo.deleteById(codigo);
			return true;
		}
		return false;
	}

}