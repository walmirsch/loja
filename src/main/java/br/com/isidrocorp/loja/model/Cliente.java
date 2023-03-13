package br.com.isidrocorp.loja.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // a classe cliente é mapeável para o banco
@Table(name = "cliente") // Mapeamento para o nome da tabela
public class Cliente {
@Id // Indico que é a chave primária
@GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincremento
@Column(name = "codigo") // Especifica definições da coluna
private int codigo;
@Column(name = "nome", nullable = false, length = 100)
private String nome;
@Column(name = "email", nullable = false, length = 100, unique = true)
private String email;
@Column(name = "whatsapp", nullable = false, length = 20, unique = true)
private String whatsapp;
@Column(name = "endereco", length = 100)
private String endereco;
@Column(name = "numero")
private int numero;
@Column(name = "complemento", length = 50)
private String complemento;
@Column(name = "cidade", length = 50)
private String cidade;
@Column(name = "bairro", length = 50)
private String bairro;
@Column(name = "cep", length = 10)
private String cep;
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getWhatsapp() {
	return whatsapp;
}
public void setWhatsapp(String whatsapp) {
	this.whatsapp = whatsapp;
}
public String getEndereco() {
	return endereco;
}
public void setEndereco(String endereco) {
	this.endereco = endereco;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public String getComplemento() {
	return complemento;
}
public void setComplemento(String complemento) {
	this.complemento = complemento;
}
public String getCidade() {
	return cidade;
}
public void setCidade(String cidade) {
	this.cidade = cidade;
}
public String getBairro() {
	return bairro;
}
public void setBairro(String bairro) {
	this.bairro = bairro;
}
public String getCep() {
	return cep;
}
public void setCep(String cep) {
	this.cep = cep;
}


} // Cliente
