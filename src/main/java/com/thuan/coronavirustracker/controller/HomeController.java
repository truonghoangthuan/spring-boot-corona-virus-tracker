package com.thuan.coronavirustracker.controller;

import com.thuan.coronavirustracker.model.LocationStats;
import com.thuan.coronavirustracker.service.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public String Home(Model model) {
        List<LocationStats> locationStats = coronaVirusDataService.getAllStats();
        model.addAttribute("locationStats", locationStats);
        return "home";
    }
}
