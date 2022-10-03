package com.lindsaywaters.tracks.controllers;

import com.lindsaywaters.tracks.data.SightingRepository;
import com.lindsaywaters.tracks.models.Location;
import com.lindsaywaters.tracks.models.Sighting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Controller
@RequestMapping("map")
public class mapController {

    @Autowired
    SightingRepository sightingRepository;
    @GetMapping("")
    public String mapIndex(HttpServletRequest request, Model model){
        List<Sighting> sightings = (List<Sighting>) sightingRepository.findAll();

        model.addAttribute("sightings", sightings);

        return "map/map";
    }

}