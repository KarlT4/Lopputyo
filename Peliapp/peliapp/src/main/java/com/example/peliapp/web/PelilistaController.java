package com.example.peliapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.peliapp.domain.Peli;
import com.example.peliapp.domain.PeliRepository;

@Controller
public class PelilistaController {
    
    @Autowired
    private PeliRepository peliRepository;
    
    //Näyttää kaikki mahdolliset pelit
    @RequestMapping(value = "/pelit", method = RequestMethod.GET)
    public String getPelit(Model model) {
     model.addAttribute("pelit", peliRepository.findAll());
     return "pelit";
    }

    //Lisää uuden pelin
    @RequestMapping(value = "/addpeli")
    public String addPeli(Model model) {
         model.addAttribute("peli", new Peli());
         return "addpeli";
    }

     //Tallentaa uuden pelin
     @RequestMapping(value = "/save", method = RequestMethod.POST)
     public String save (Peli peli) {
        peliRepository.save(peli);
        return "redirect:/pelit";
     }
    
     //Poistaa pelin
     @RequestMapping(value = "/delete")
     public String deletePeli(@RequestParam Long peliId) {
         peliRepository.deleteById(peliId);
         return "redirect:/pelit";
     }
}
