package com.lindsaywaters.tracks.controllers;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("map")
public class mapController {
    @GetMapping("")
    public String mapIndex(HttpServletRequest request, Model model){

        return "map/map";
    }
}