package br.com.cast.apifilme.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchListaDTO {
	
	@JsonProperty("Search")
	List<SearchDTO> listaSearchDTO;

	public List<SearchDTO> getListaSearchDTO() {
		return listaSearchDTO;
	}

	public void setListaSearchDTO(List<SearchDTO> listaSearchDTO) {
		this.listaSearchDTO = listaSearchDTO;
	}
	
	
	
}
