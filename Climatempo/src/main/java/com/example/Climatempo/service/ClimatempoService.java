package com.example.Climatempo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClimatempoService {

    private final String API_URL = "https://apiadvisor.climatempo.com.br/api/v1/anl/synoptic/locale/BR?token=";
    private final String TOKEN = "45feba078cc4107a828ab254825cecc9";
    private final RestTemplate restTemplate;

    public ClimatempoService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public String getWeather() {
        String url = API_URL + TOKEN;
        return restTemplate.getForObject(url, String.class);
    }
}
