package com.lindsaywaters.tracks.controllers;

import com.lindsaywaters.tracks.data.SightingRepository;
import com.lindsaywaters.tracks.data.UserRepository;
import com.lindsaywaters.tracks.models.Sighting;
import com.lindsaywaters.tracks.models.User;
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
    @Autowired
    UserRepository userRepository;

    @GetMapping("index")
    public String index(HttpServletRequest request, Model model){

        return ("index");
    }

    @GetMapping("userDashboard")
    public String userDashboard(HttpServletRequest request, Model model) {
        User user = userController.getUserInformation(request.getSession());

        return "user/userDashboard";

    }



    @GetMapping("mySightings")
    public String mySightings(HttpServletRequest request, Model model){

        List<Sighting> sightings = (List<Sighting>) sightingRepository.findAll();

        model.addAttribute("sightings", sightings);

        return "mySightings";
    }


}