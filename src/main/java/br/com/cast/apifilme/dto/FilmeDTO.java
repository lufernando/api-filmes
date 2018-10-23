package br.com.cast.apifilme.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;


public class FilmeDTO {
	
	@JsonProperty("imdbID")
	private String id;
	@JsonProperty("Title")
	private String titulo;
	@JsonProperty("Year")
	private String ano;
	@JsonProperty("Rated")
	private String classificacao;
	@JsonProperty("Released")
	private String dataLancamento;
	@JsonProperty("Runtime")
	private String duracao;
	@JsonProperty("Genre")
	private String genero;
	@JsonProperty("Director")
	private String diretor;
	@JsonProperty("Writer")
	private String escritor;
	@JsonProperty("Actors")
	private String elenco;
	@JsonProperty("Plot")
	private String sinopse;
	@JsonProperty("Language")
	private String linguagem;
	@JsonProperty("Country")
	private String pais;
	@JsonProperty("Awards")
	private String premios;
	@JsonProperty("Production")
	private String produtora;
	@JsonProperty("Website")
	private String site;
	@JsonProperty("Poster")
	private String poster;
	
	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
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

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public Date getDataConvertida() {
		if (dataLancamento != null) {
			try {
				return new SimpleDateFormat("yyyy-MM-dd").parse(dataLancamento);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
