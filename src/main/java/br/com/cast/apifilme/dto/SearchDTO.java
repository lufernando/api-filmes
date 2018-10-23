package br.com.cast.apifilme.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchDTO {
	
	@JsonProperty("Title")
	private String titulo;
	@JsonProperty("Year")
	private String ano;
	@JsonProperty("imdbID")
	private String id_search;
	@JsonProperty("Type")
	private String tipo;
	@JsonProperty("Poster")
	private String poster;
	
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
	public String getId_search() {
		return id_search;
	}
	public void setId_search(String id_search) {
		this.id_search = id_search;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	
}
