package br.com.cast.apifilme.dto;

import br.com.cast.apifilme.entity.Filme;

public class ResultFilmeDTO {
	
	private String id;
	private String titulo;
	private String ano;
	private String classificacao;
	private String dataLancamento;
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
	public static ResultFilmeDTO fromFilme(Filme f) {
		if (f == null) return null;
		ResultFilmeDTO dto = new ResultFilmeDTO();
		dto.setAno(f.getAno());
		dto.setClassificacao(f.getClassificacao());
		dto.setDataLancamento(f.getDataLancamento());
		dto.setDiretor(f.getDiretor());
		dto.setDuracao(f.getDuracao());
		dto.setElenco(f.getElenco());
		dto.setEscritor(f.getEscritor());
		dto.setGenero(f.getGenero());
		dto.setId(f.getId());
		dto.setLinguagem(f.getLinguagem());
		dto.setPais(f.getLinguagem());
		dto.setPremios(f.getPremios());
		dto.setProdutora(f.getProdutora());
		dto.setSinopse(f.getSinopse());
		dto.setSite(f.getSite());
		dto.setTitulo(f.getTitulo());
		
		return dto;
	}

}
