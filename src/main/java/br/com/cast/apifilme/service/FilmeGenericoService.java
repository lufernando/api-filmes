package br.com.cast.apifilme.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cast.apifilme.client.FilmeCliente;
import br.com.cast.apifilme.dto.ResultFilmeGenericoDTO;
import br.com.cast.apifilme.entity.FilmeGenerico;
import br.com.cast.apifilme.repository.FilmeGenericoRepository;

@Service
public class FilmeGenericoService {
	@Autowired
	private FilmeCliente filmeCliente;
	
	@Autowired
	private FilmeGenericoRepository filmeGenericoRepository;
	
	public ResultFilmeGenericoDTO getListaFilme(String titulo) {
		
		try {
		List<FilmeGenerico> listaDeEntidade = filmeGenericoRepository.buscarFilme(titulo);
		List<ResultFilmeGenericoDTO> resultListaGenericaDTO = new ArrayList<>();
		
		for (FilmeGenerico dto : listaDeEntidade) {
			
			ResultFilmeGenericoDTO listaDto = entidadeGenericaParaDTO(dto);
			
			resultListaGenericaDTO.add(listaDto);
		}
		
		}catch(Exception e) {
			//Buscar na api do imdb
		}
		
		
		
		
		return null;
	}

	private ResultFilmeGenericoDTO entidadeGenericaParaDTO(FilmeGenerico dto) {
		ResultFilmeGenericoDTO r = new ResultFilmeGenericoDTO();
		r.setAno(dto.getAno());
		r.setId_search(dto.getId());
		r.setPoster(dto.getPoster());
		r.setTipo(dto.getTipo());
		r.setTitulo(dto.getTitulo());
		return r;
	}
	
	

}
