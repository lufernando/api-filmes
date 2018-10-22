package br.com.cast.apifilme.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cast.apifilme.dto.FilmeDTO;
import br.com.cast.apifilme.service.FilmeService;

@RestController
@RequestMapping("path=/api")
public class FilmeAPI {
	
	@Autowired
	private FilmeService service;
	
	@GetMapping
	public FilmeDTO getFilmes(@RequestParam("q")String titulo){
		return service.getFilme(titulo.toLowerCase());
	}
	

}
