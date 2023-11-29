package com.example.peliapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.peliapp.domain.Peli;
import com.example.peliapp.domain.PeliRepository;

@SpringBootApplication
public class PeliappApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeliappApplication.class, args);
	}

	@Bean

	//Esimerkkipelejä
	public CommandLineRunner demo(PeliRepository peliRepository) {
		return (args) -> {
			Peli peli1 = new Peli("Tetris", "Aivopähkinä","https://tetris.com/play-tetris/");
			peliRepository.save(peli1);
			
			Peli peli2 = new Peli("Runescape", "Massiivinen moninpeli", "https://runescape.com");
			peliRepository.save(peli2);

			Peli peli3 = new Peli("Minecraft", "Selviytyminen", "https://mojang.com");
			peliRepository.save(peli3);
		};
	}
}
