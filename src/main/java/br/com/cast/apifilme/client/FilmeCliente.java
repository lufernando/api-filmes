package br.com.cast.apifilme.client;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.cast.apifilme.dto.FilmeDTO;
import br.com.cast.apifilme.dto.SearchListaDTO;

@Component
public class FilmeCliente {
	
	private static final String URL_BUSCA_FILMES_DETALHADO = "http://www.omdbapi.com/?apikey={appid}&i={id}";
	private static final String URL_BUSCA_LISTA = "http://www.omdbapi.com/?apikey={appid}&s={titulo}";
	private static final String APPID = "62bb8ac";
	private RestTemplate client;
	
	public FilmeCliente(RestTemplateBuilder builder) {
		this.client = builder.build();
	}
	
	public FilmeDTO getFilmeDetalhado(String id) {
		FilmeDTO filmeDTO = this.client.getForObject(URL_BUSCA_FILMES_DETALHADO, FilmeDTO.class, APPID ,id);
		return filmeDTO;
	}
	
	public SearchListaDTO getListaFilmes(String titulo) {
		SearchListaDTO result = this.client.getForObject(URL_BUSCA_LISTA, SearchListaDTO.class,  APPID, titulo);
		return result;
	}
	
	
}
