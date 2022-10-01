package com.lindsaywaters.tracks.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class homeController {

    @GetMapping
    public String index(HttpServletRequest request, Model model){

        return ("index");
    }
}