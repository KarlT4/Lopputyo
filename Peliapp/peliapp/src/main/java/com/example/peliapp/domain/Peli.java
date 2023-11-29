package com.example.peliapp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Peli {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long peliId;

	private String nimi;
	private String genre;
	private String linkki;

	public Peli(String nimi, String genre, String linkki) {
		this.nimi = nimi;
		this.genre = genre;
		this.linkki = linkki;
	}

	public Peli() {
		this.nimi = null;
		this.genre = null;
		this.linkki = null;
	}

	public Long getPeliId() {
		return peliId;
	}
	public void setPeliId(Long peliId) {
		this.peliId = peliId;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getLinkki() {
		return linkki;
	}
	public void setLinkki(String linkki) {
		this.linkki = linkki;
	}

	@Override
	public String toString() {
		return "Peli [peliId=" + peliId + ", nimi=" + nimi + ", genre=" + genre + ", linkki=" + linkki + "]";
	}
	
}
