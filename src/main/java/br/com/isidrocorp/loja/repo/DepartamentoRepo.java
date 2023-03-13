package br.com.isidrocorp.loja.repo;

import org.springframework.data.repository.CrudRepository;

import br.com.isidrocorp.loja.model.Departamento;

public interface DepartamentoRepo extends CrudRepository<Departamento, Integer>{

}