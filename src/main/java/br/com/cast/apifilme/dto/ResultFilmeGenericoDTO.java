package br.com.cast.apifilme.dto;

import br.com.cast.apifilme.entity.Filme;

public class ResultFilmeGenericoDTO {
	
	private String titulo;
	private String ano;
	private String id_search;
	private String tipo;
	private String poster;
	private Filme filme;
	
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
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
