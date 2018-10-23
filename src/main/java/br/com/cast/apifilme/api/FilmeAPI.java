package br.com.cast.apifilme.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.cast.apifilme.dto.ResultFilmeDTO;
import br.com.cast.apifilme.dto.ResultFilmeGenericoDTO;
import br.com.cast.apifilme.service.FilmeService;

@RestController
@RequestMapping(path="/api")
public class FilmeAPI {
	
	@Autowired
	private FilmeService service;
	
	@GetMapping(path="/{id}")
	public ResultFilmeDTO getFilmes(@PathVariable("id") String id){
		return service.getFilmeDetail(id);
	}
	
	/*@GetMapping(path="/{titulo}")
	public ResultFilmeGenericoDTO getListaFilmes(@PathVariable("titulo") String titulo){
		return service.buscarListaGenerica(titulo);
	}*/

}
