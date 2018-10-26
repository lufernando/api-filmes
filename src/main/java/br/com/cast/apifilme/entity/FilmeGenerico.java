package br.com.cast.apifilme.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.cast.apifilme.dto.ResultFilmeDTO;

@Entity
@Table(name="filmegenerico", schema="filmeapi")
public class FilmeGenerico {
	
	@Id
	private String id;
	
	private String titulo;
	private String ano;
	private String tipo;
	private String poster;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_filme_generico")
	private Filme filme;
	
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
	public Filme getFilme() {
		return filme;
	}
	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	public static Filme fromDto(ResultFilmeDTO dto) {
		Filme f = new Filme();
		f.setAno(dto.getAno());
		f.setClassificacao(dto.getClassificacao());
		f.setDataLancamento(dto.getDataLancamento());
		f.setDiretor(dto.getDiretor());
		f.setDuracao(dto.getDuracao());
		f.setElenco(dto.getElenco());
		f.setEscritor(dto.getEscritor());
		f.setGenero(dto.getGenero());
		f.setId(dto.getId());
		f.setLinguagem(dto.getLinguagem());
		f.setPais(dto.getPais());
		f.setPremios(dto.getPremios());
		f.setProdutora(dto.getProdutora());
		f.setSinopse(dto.getSinopse());
		f.setSite(dto.getSite());
		f.setTitulo(dto.getTitulo());
		
		return f;
	} 

}
