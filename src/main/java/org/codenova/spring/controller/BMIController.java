package org.codenova.spring.controller;


import org.codenova.spring.model.BodyStats;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bmi")
public class BMIController {

    @RequestMapping("/form")
    public String bmiFormHandle () {
        return "bmi/form";
    }

    @RequestMapping("/calculate")
    public String bmiCalculateHandle (@ModelAttribute BodyStats b, Model model){

        double h = b.getHeight();

        double w = b.getWeight();


        double bmi = w / ((h/100) * (h/100));
        double minKg = 20 * ((h/100) * (h/100));
        double maxKg = 25 * ((h/100) * (h/100));

         /*
            ModelAttriubte 를 써서 객체로 파라미터를 바인딩하면,
            실제 파라미터는 해당 객체의 getter 를 통해 사용해야된다.!

            ModelAttribute 로 받은 객체는 자동으로 addAttribute 처리가 된다.
            이름이 머로 attribute 가 되는가? 클래스명으로 (앞에만 소문자 처리되서)
         */

        String.format("%.2f",bmi);

        model.addAttribute("bmi", bmi);
        model.addAttribute("minKg", minKg);
        model.addAttribute("maxKg", maxKg);

        // model.addAttribute("bodyStats", b); // 자동


        return "bmi/result";
    }




}
