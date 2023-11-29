package com.example.peliapp.domain;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface PeliRepository extends CrudRepository<Peli, Long> {
    
	List<Peli> findByNimi(String nimi);
}