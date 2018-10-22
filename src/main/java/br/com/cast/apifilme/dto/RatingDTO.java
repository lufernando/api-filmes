package br.com.cast.apifilme.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RatingDTO {
	
	@JsonProperty("Source")
	private String fonte;
	@JsonProperty("Value")
	private String valor;
	
	public String getFonte() {
		return fonte;
	}
	public void setFonte(String fonte) {
		this.fonte = fonte;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	

}
