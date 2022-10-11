package com.lindsaywaters.tracks.controllers;

import com.lindsaywaters.tracks.data.SightingRepository;
import com.lindsaywaters.tracks.models.Sighting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.TreeMap;

@Controller
public class homeController {

    @Autowired
    SightingRepository sightingRepository;

    @GetMapping("index")
    public String index(HttpServletRequest request, Model model){

        return ("index");
    }

    @GetMapping("login")
    public  String login(HttpServletRequest request, Model model){
        return ("login");
    }



    @GetMapping("mySightings")
    public String mySightings(HttpServletRequest request, Model model){

        List<Sighting> sightings = (List<Sighting>) sightingRepository.findAll();

        model.addAttribute("sightings", sightings);

        return "mySightings";
    }


}