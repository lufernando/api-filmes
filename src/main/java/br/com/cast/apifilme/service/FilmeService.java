package br.com.cast.apifilme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cast.apifilme.client.FilmeCliente;
import br.com.cast.apifilme.dto.FilmeDTO;
import br.com.cast.apifilme.entity.Filme;
import br.com.cast.apifilme.repository.FilmeRepository;

@Service
public class FilmeService {
	
	@Autowired
	private FilmeCliente filmeCliente;
	
	@Autowired
	private FilmeRepository filmeRepository;
	
	public FilmeDTO getFilme(String titulo){
		
		List<Filme> entidadeBuscada = filmeRepository.buscarFilmes(titulo);
		return null;
		
		
		
		
	}

}
