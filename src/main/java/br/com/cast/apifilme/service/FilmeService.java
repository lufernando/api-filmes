package br.com.cast.apifilme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cast.apifilme.client.FilmeCliente;
import br.com.cast.apifilme.dto.FilmeDTO;
import br.com.cast.apifilme.dto.ResultFilmeDTO;
import br.com.cast.apifilme.entity.Filme;
import br.com.cast.apifilme.repository.FilmeRepository;

@Service
public class FilmeService {
	
	@Autowired
	private FilmeCliente filmeCliente;
	
	@Autowired
	private FilmeRepository filmeRepository;
	
	public ResultFilmeDTO getFilmeDetail(String id){
		
		List<Filme> entidadeBuscada = filmeRepository.buscarFilme(id);
		ResultFilmeDTO resultDTO = new ResultFilmeDTO();
		
		if(entidadeBuscada.size() != 0) {
			
			for (Filme dto : entidadeBuscada) {
				
				resultDTO = entidadeParaDto(dto);
				
			}
			
		}else {
			FilmeDTO filme = filmeCliente.getFilmeDetalhado(id);
				
			resultDTO = apiParaDto(id, filme);
			inserir(resultDTO);
			
		}
		
		return resultDTO;
		
	}
	
	public void inserir(ResultFilmeDTO dto) {
		
		Filme filme = dtoParaEntidade(dto);
		
		filmeRepository.inserir(filme);
	}

	private Filme dtoParaEntidade(ResultFilmeDTO dto) {
		Filme f = new Filme();
		f.setAno(dto.getAno());
		f.setClassificacao(dto.getClassificacao());
		f.setDataLancamento(dto.getDataLancamento());
		f.setDiretor(dto.getDiretor());
		f.setDuracao(dto.getDuracao());
		f.setElenco(dto.getElenco());
		f.setEscritor(dto.getEscritor());
		f.setGenero(dto.getGenero());
		f.setId(dto.getId());
		f.setLinguagem(dto.getLinguagem());
		f.setPais(dto.getPais());
		f.setPremios(dto.getPremios());
		f.setProdutora(dto.getProdutora());
		f.setSinopse(dto.getSinopse());
		f.setSite(dto.getSite());
		f.setTitulo(dto.getTitulo());
		return f;
	}

	private ResultFilmeDTO apiParaDto(String id, FilmeDTO filme) {
		ResultFilmeDTO resultDto = new ResultFilmeDTO();
		resultDto.setId(id);
		resultDto.setTitulo(filme.getTitulo());
		resultDto.setAno(filme.getAno());
		resultDto.setClassificacao(filme.getClassificacao());
		resultDto.setDataLancamento(filme.getDataLancamento());
		resultDto.setDiretor(filme.getDiretor());
		resultDto.setDuracao(filme.getDuracao());
		resultDto.setElenco(filme.getElenco());
		resultDto.setEscritor(filme.getEscritor());
		resultDto.setGenero(filme.getGenero());
		resultDto.setId(filme.getId());
		resultDto.setLinguagem(filme.getLinguagem());
		resultDto.setPais(filme.getPais());
		resultDto.setPremios(filme.getPremios());
		resultDto.setProdutora(filme.getProdutora());
		resultDto.setSinopse(filme.getSinopse());
		resultDto.setSite(filme.getSite());
		resultDto.setPoster(filme.getPoster());
		return resultDto;
	}

	private ResultFilmeDTO entidadeParaDto(Filme dto) {
		ResultFilmeDTO resultadoDTO = new ResultFilmeDTO();
		resultadoDTO.setAno(dto.getAno());
		resultadoDTO.setClassificacao(dto.getClassificacao());
		resultadoDTO.setDataLancamento(dto.getDataLancamento());
		resultadoDTO.setDiretor(dto.getDiretor());
		resultadoDTO.setDuracao(dto.getDuracao());
		resultadoDTO.setElenco(dto.getElenco());
		resultadoDTO.setEscritor(dto.getEscritor());
		resultadoDTO.setGenero(dto.getGenero());
		resultadoDTO.setId(dto.getId());
		resultadoDTO.setLinguagem(dto.getLinguagem());
		resultadoDTO.setPais(dto.getLinguagem());
		resultadoDTO.setPremios(dto.getPremios());
		resultadoDTO.setProdutora(dto.getProdutora());
		resultadoDTO.setSinopse(dto.getSinopse());
		resultadoDTO.setSite(dto.getSite());
		resultadoDTO.setTitulo(dto.getTitulo());
		return resultadoDTO;
	}
	
}
