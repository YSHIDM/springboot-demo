package com.yshidm.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yshidm.demo.service.ICityService;

@Controller
public class CityController {

    @Autowired
    private ICityService cityService;

    @GetMapping("/showCities")
    public String findCities(Model model) {

        var cities = cityService.findAll();

        model.addAttribute("cities", cities);

        return "showCities";
    }
}
