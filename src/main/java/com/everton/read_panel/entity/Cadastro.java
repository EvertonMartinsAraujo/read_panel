package com.everton.read_panel.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "cadastro")
public class Cadastro{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;
	
	@Column (nullable = false)
	private String titulo;
	
	@Column (nullable = true)
	private String alternativo;
	
	@Column
	private String link;
	
	@Column
	private Long capitulo;
	
	@Column
	private Long acompanhamento;
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setAlternativo(String alternativo) {
		this.alternativo = alternativo;
	}
	public String getAlternativo() {
		return alternativo;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getLink() {
		return link;
	}
	public void setCapitulo(Long capitulo) {
		this.capitulo = capitulo;
	}
	public Long getCapitulo() {
		return capitulo;
	}
	public void setAcompanhamento(Long acompanhamento) {
		this.acompanhamento = acompanhamento;
	}
	public Long getAcompanhamento() {
		return acompanhamento;
	}
}
