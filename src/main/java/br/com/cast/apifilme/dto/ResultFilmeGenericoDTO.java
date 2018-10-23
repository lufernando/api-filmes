package br.com.cast.apifilme.dto;

public class ResultFilmeGenericoDTO {
	
	private String titulo;
	private String ano;
	private String id_search;
	private String tipo;
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
