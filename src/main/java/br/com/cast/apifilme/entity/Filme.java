package br.com.cast.apifilme.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="filme", schema="filmeapi")
public class Filme {
	
	@Id
	private String id;
	private String titulo;
	private String ano;
	private String classificacao;
	private Date dataLancamento;
	private String duracao;
	private String genero;
	private String diretor;
	private String escritor;
	private String elenco;
	private String sinopse;
	private String linguagem;
	private String pais;
	private String premios;
	private String produtora;
	private String site;
	@Column(name="rating_fonte")
	private String fonte;
	@Column(name="rating_valor")
	private String valor;
	
	public String getFonte() {
		return fonte;
	}
	public void setFonte(String fonte) {
		this.fonte = fonte;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public Date getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public String getEscritor() {
		return escritor;
	}
	public void setEscritor(String escritor) {
		this.escritor = escritor;
	}
	public String getElenco() {
		return elenco;
	}
	public void setElenco(String elenco) {
		this.elenco = elenco;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public String getLinguagem() {
		return linguagem;
	}
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getPremios() {
		return premios;
	}
	public void setPremios(String premios) {
		this.premios = premios;
	}
	public String getProdutora() {
		return produtora;
	}
	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	
}