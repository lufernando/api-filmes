package br.com.cast.apifilme.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cast.apifilme.dto.ResultFilmeDTO;
import br.com.cast.apifilme.dto.ResultFilmeGenericoDTO;
import br.com.cast.apifilme.service.FilmeGenericoService;
import br.com.cast.apifilme.service.FilmeService;

@RestController
@RequestMapping(path="/api")
public class FilmeAPI {
	
	@Autowired
	private FilmeService service;
	
	@Autowired
	private FilmeGenericoService filmeGenericoservice;
	
	//BUSCA DETALHADA
	@GetMapping(path="/id/{id}")
	public ResultFilmeDTO getFilmes(@PathVariable("id") String id){
		return service.getFilmeDetail(id);
	}
	
	//BUSCA NO BANCO
	@GetMapping(path="/titulo/{titulo}")
	public List<ResultFilmeGenericoDTO> getListaFilmesLocal(@PathVariable("titulo") String titulo){
		return filmeGenericoservice.getListaFilme(titulo);
	}
	
	// BUSCA NO BANCO
	@GetMapping(path = "/buscaInicial")
	public List<ResultFilmeGenericoDTO> getListaInicial() {
		return filmeGenericoservice.getListaFilmeInicial();
	}
	
	// BUSCA NA API
	@GetMapping(path = "/api/{titulo}")
	public List<ResultFilmeGenericoDTO> getListaFilmesApi(@PathVariable("titulo") String titulo) {
		return filmeGenericoservice.getListaGenerica(titulo);
	}

}
