package br.com.cast.apifilme.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cast.apifilme.client.FilmeCliente;
import br.com.cast.apifilme.dto.ResultFilmeGenericoDTO;
import br.com.cast.apifilme.dto.SearchDTO;
import br.com.cast.apifilme.dto.SearchListaDTO;
import br.com.cast.apifilme.entity.FilmeGenerico;
import br.com.cast.apifilme.repository.FilmeGenericoRepository;

@Service
public class FilmeGenericoService {
	@Autowired
	private FilmeCliente filmeCliente;
	
	@Autowired
	private FilmeGenericoRepository filmeGenericoRepository;
	
	public List<ResultFilmeGenericoDTO> getListaFilme(String id) {
		
		List<FilmeGenerico> listaDeEntidade = filmeGenericoRepository.buscarFilme(id);
		List<ResultFilmeGenericoDTO> resultListaGenericaDTO = new ArrayList<>();
		
			for (FilmeGenerico dto : listaDeEntidade) {

				ResultFilmeGenericoDTO listaDto = entidadeGenericaParaDTO(dto);

				resultListaGenericaDTO.add(listaDto);
			}
		
		return resultListaGenericaDTO;
	}
	
	
	public List<ResultFilmeGenericoDTO> getListaGenerica(String titulo){
		
		
		
		 SearchListaDTO listaApi = filmeCliente.getListaFilmes(titulo);
		 
		 List<ResultFilmeGenericoDTO> result = apiParaDTO(titulo, listaApi);
		
		return result;
	}
	

	private List<ResultFilmeGenericoDTO> apiParaDTO(String titulo, SearchListaDTO listaApi) {
		List<ResultFilmeGenericoDTO> resultListaGenerico = new ArrayList<>();
		List<SearchDTO> listaDTO = listaApi.getListaSearchDTO();
		
		for (SearchDTO sl : listaDTO) {
			ResultFilmeGenericoDTO result = new ResultFilmeGenericoDTO();
			result.setAno(sl.getAno());
			result.setFilme(sl.getFilme());
			result.setId_search(sl.getId_search());
			result.setPoster(sl.getPoster());
			result.setTipo(sl.getTipo());
			result.setTitulo(sl.getTitulo());
			
			resultListaGenerico.add(result);
		}
		return resultListaGenerico;
	}

	private ResultFilmeGenericoDTO entidadeGenericaParaDTO(FilmeGenerico dto) {
		ResultFilmeGenericoDTO r = new ResultFilmeGenericoDTO();
		r.setAno(dto.getAno());
		r.setId_search(dto.getId());
		r.setPoster(dto.getPoster());
		r.setTipo(dto.getTipo());
		r.setTitulo(dto.getTitulo());
		r.setFilme(dto.getFilme());
		return r;
	}
	
	private List<ResultFilmeGenericoDTO> buscarListaNoBanco(String titulo){
		List<FilmeGenerico> listaGenericos = filmeGenericoRepository.buscarFilme(titulo);
		return listaGenericos.stream().map(f -> ResultFilmeGenericoDTO.paraEntidade(f)).collect(Collectors.toList());
	}
	

}
