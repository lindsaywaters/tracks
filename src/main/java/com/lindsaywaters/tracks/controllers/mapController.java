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

import javax.servlet.ServletOutputStream;
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
    public String mapIndex(HttpServletRequest request, Model model, Sighting sighting){
        List<Sighting> sightings = (List<Sighting>) sightingRepository.findAll();

        List<Location> locations = getLocationList(sightings);
        model.addAttribute("sightings", sightings);
        model.addAttribute("locations", getLocationList(sightings));

        System.out.println(locations);
        return "map/map";
    }
    private List<Location> getLocationList(List<Sighting> sightingsList){
        List<Location> returnList = new ArrayList<>();
        for(Sighting sighting:sightingsList){
            String[] locationArray = sighting.getLocation().split(",");
            Location location = new Location(Double.parseDouble(locationArray[0]),Double.parseDouble(locationArray[1]));
            returnList.add(location);
        }
//        System.out.println(sightingsList);

        return returnList;
    }

}