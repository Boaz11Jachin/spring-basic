package org.codenova.spring.controller;


import org.codenova.spring.model.BodyStats;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/bmi")
public class BMIController {

    @RequestMapping("/form")
    public String bmiFormHandle () {
        return "bmi/form";
    }

    @RequestMapping("/calculate")
    public String bmiCalculateHandle (@ModelAttribute BodyStats bodyStats, Model model){

        double h = bodyStats.getHeight();

        double w = bodyStats.getWeight();


        double bmi = w / ((h/100) * (h/100));
        double minKg = 20 * ((h/100) * (h/100));
        double maxKg = 25 * ((h/100) * (h/100));


        String.format("%.2f",bmi);

        model.addAttribute("bmi", bmi);
        model.addAttribute("minKg", minKg);
        model.addAttribute("maxKg", maxKg);


        return "bmi/result";
    }




}
