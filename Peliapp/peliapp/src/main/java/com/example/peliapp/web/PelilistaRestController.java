package com.example.peliapp.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.peliapp.domain.Peli;
import com.example.peliapp.domain.PeliRepository;

@CrossOrigin
@Controller
public class PelilistaRestController{

	@Autowired
	private PeliRepository peliRepository;

	//Hakee kaikki pelit
	@RequestMapping(value = "/api/pelit", method = RequestMethod.GET)
	public @ResponseBody List<Peli> peliListRest() {
		return (List<Peli>) peliRepository.findAll();
	}
}