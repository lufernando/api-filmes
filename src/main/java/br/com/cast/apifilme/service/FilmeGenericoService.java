package br.com.cast.apifilme.service;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<ResultFilmeGenericoDTO> getListaFilme(String titulo) {

		List<FilmeGenerico> listaDeEntidade = filmeGenericoRepository.buscarFilme(titulo);
		List<ResultFilmeGenericoDTO> resultListaGenericaDTO = new ArrayList<>();

		if (listaDeEntidade.isEmpty()) {
			
			return null;

		} else {

				List<ResultFilmeGenericoDTO> listaDto = entidadeGenericaParaDTO(listaDeEntidade);
				
				for (ResultFilmeGenericoDTO rl : listaDto) {
					ResultFilmeGenericoDTO r = new ResultFilmeGenericoDTO();
					r.setAno(rl.getAno());
					r.setFilme(rl.getFilme());
					r.setId_search(rl.getId_search());
					r.setPoster(rl.getPoster());
					r.setTipo(rl.getTipo());
					r.setTitulo(rl.getTitulo());
					
					resultListaGenericaDTO.add(r);
				
				}
				
		}
		return resultListaGenericaDTO;
	
	}
	
	public List<ResultFilmeGenericoDTO> getListaGenerica(String titulo){
		
		 SearchListaDTO listaApi = filmeCliente.getListaFilmes(titulo);
		 List<ResultFilmeGenericoDTO> result = apiParaDTO(titulo, listaApi);
		 List<FilmeGenerico> listaEntidade = dtoParaEntidade(result);
		 //List<ResultFilmeGenericoDTO> listAtualizada = new ArrayList<>();
		 
		 for (FilmeGenerico entidade : listaEntidade) { 
			 
				FilmeGenerico e = new FilmeGenerico();
				e.setAno(entidade.getAno());
				e.setFilme(entidade.getFilme());
				e.setId(entidade.getId());
				e.setPoster(entidade.getPoster());
				e.setTipo(entidade.getTipo());
				e.setTitulo(entidade.getTitulo());
				
				filmeGenericoRepository.inserir(e);
				
		}
		
		return result;
	}
	
	
	//----------CONVERSÕES-----------
	
	private List<FilmeGenerico> dtoParaEntidade(List<ResultFilmeGenericoDTO> result) {
		List<FilmeGenerico> fGenerico = new ArrayList<>();
		
		for (ResultFilmeGenericoDTO dto : result) {
			FilmeGenerico e = new FilmeGenerico();
			e.setAno(dto.getAno());
			e.setFilme(dto.getFilme());
			e.setId(dto.getId_search());
			e.setPoster(dto.getPoster());
			e.setTipo(dto.getTipo());
			e.setTitulo(dto.getTitulo());
			
			fGenerico.add(e);
		}
		 
		return fGenerico;
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

	private List<ResultFilmeGenericoDTO> entidadeGenericaParaDTO(List<FilmeGenerico> listaDeEntidade) {
		List<ResultFilmeGenericoDTO> r = new ArrayList<>();
		
		for (FilmeGenerico entidade : listaDeEntidade) {
			ResultFilmeGenericoDTO fg = new ResultFilmeGenericoDTO();
			fg.setAno(entidade.getAno());
			fg.setFilme(entidade.getFilme());
			fg.setId_search(entidade.getId());
			fg.setPoster(entidade.getPoster());
			fg.setTipo(entidade.getTipo());
			fg.setTitulo(entidade.getTitulo());
			
			r.add(fg);
			
		}
		
		return r;
	}

}
