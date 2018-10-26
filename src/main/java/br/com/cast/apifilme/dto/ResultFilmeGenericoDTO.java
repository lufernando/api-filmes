package br.com.cast.apifilme.dto;

import br.com.cast.apifilme.entity.Filme;
import br.com.cast.apifilme.entity.FilmeGenerico;

public class ResultFilmeGenericoDTO {

	private String titulo;
	private String ano;
	private String id_search;
	private String tipo;
	private String poster;
	private ResultFilmeDTO dto;

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

	public ResultFilmeDTO getFilme() {
		return dto;
	}

	public void setFilme(ResultFilmeDTO filme) {
		this.dto = filme;
	}

	public static ResultFilmeGenericoDTO deFilmeGenerico(FilmeGenerico f) {
		if (f == null) return null;
		ResultFilmeGenericoDTO dto = new ResultFilmeGenericoDTO();
		dto.setAno(f.getAno());
		dto.setFilme(ResultFilmeDTO.fromFilme(f.getFilme()));
		dto.setId_search(f.getId());
		dto.setPoster(f.getPoster());
		dto.setTipo(f.getTipo());
		dto.setTitulo(f.getTitulo());
		
		return dto;
	}

	public static ResultFilmeDTO fromDTO(Filme dto) {
		if(dto == null) return null;
		ResultFilmeDTO e = new ResultFilmeDTO();
		e.setAno(dto.getAno());
		e.setId(dto.getId());
		e.setTitulo(dto.getTitulo());
		e.setAno(dto.getAno());
		e.setClassificacao(dto.getClassificacao());
		e.setDataLancamento(dto.getDataLancamento());
		e.setDiretor(dto.getDiretor());
		e.setDuracao(dto.getDuracao());
		e.setElenco(dto.getElenco());
		e.setEscritor(dto.getEscritor());
		e.setGenero(dto.getGenero());
		e.setId(dto.getId());
		e.setLinguagem(dto.getLinguagem());
		e.setPais(dto.getPais());
		e.setPremios(dto.getPremios());
		e.setProdutora(dto.getProdutora());
		e.setSinopse(dto.getSinopse());
		e.setSite(dto.getSite());
		
		
		return null;
	}

}
