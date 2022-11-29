package com.lindsaywaters.tracks.controllers;

import com.lindsaywaters.tracks.data.SightingRepository;
import com.lindsaywaters.tracks.models.Location;
import com.lindsaywaters.tracks.models.Sighting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.xml.crypto.Data;
import java.sql.Time;
import java.util.Date;

@Controller
@RequestMapping("report")
public class reportController {
    @Autowired
    SightingRepository sightingRepository;

    @GetMapping("createReport")
    public String displayCreateReport(HttpServletRequest request, Model model){
        model.addAttribute(new Sighting());
        return "report/createReport";
    }

    @PostMapping("createReport")
    public String processCreateReport(HttpServletRequest request, Model model, Sighting sighting){
        Sighting newSighting = new Sighting(sighting.getSightingDate(), sighting.getSightingTime(), sighting.getDescription(), sighting.getAddress1(), sighting.getAddress2(), sighting.getCity(), sighting.getState(), sighting.getZipcode(), sighting.getLocation() ) ;
        sightingRepository.save(newSighting);
        model.addAttribute(sighting);
        return "report/createReport";
//        return "report/reportConfirmation";
    }

}