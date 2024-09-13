package com.example.Climatempo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Climatempo.service.ClimatempoService;

@RestController
public class ClimatempoController {

    private final ClimatempoService climatempoService;

    public ClimatempoController(ClimatempoService climatempoService) {
        this.climatempoService = climatempoService;
    }

    
    @GetMapping("/weather")
    public String getWeather() {
        return climatempoService.getWeather();
    }
}
