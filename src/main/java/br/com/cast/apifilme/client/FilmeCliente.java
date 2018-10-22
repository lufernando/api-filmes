package br.com.cast.apifilme.client;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.cast.apifilme.dto.FilmeDTO;

@Component
public class FilmeCliente {
	
	private static final String URL_BUSCA_FILMES = "http://www.omdbapi.com/?apikey={appid}&t={titulo}";
	private static final String APPID = "62bb8ac";
	private RestTemplate client;
	
	public FilmeCliente(RestTemplateBuilder builder) {
		this.client = builder.build();
	}
	
	public FilmeDTO getFilmes(String titulo) {
		FilmeDTO filmeDTO = this.client.getForObject(URL_BUSCA_FILMES, FilmeDTO.class, titulo, APPID);
		return filmeDTO;
	}
}
