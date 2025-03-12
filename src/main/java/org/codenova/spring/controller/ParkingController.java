package org.codenova.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/parking")
public class ParkingController {

    @RequestMapping("/form")
    public String parkingFormHandle (){

        return "parking/form";
    }

    @RequestMapping("/calculate")
    public String parkingCalculateHandle (@RequestParam("carNumber") String carNumber, @RequestParam("parkingTime") int parkingTime,
                                          @RequestParam("shoppingAmount") int shoppingAmount, Model model) {

        System.out.println("carNumber : "+ carNumber);
        System.out.println("parkingTime : "+parkingTime);
        System.out.println("shoppingAmount : "+shoppingAmount);

        int chargeMinutes = parkingTime;
        if (shoppingAmount>=100_000){
            chargeMinutes -= 5*60;
        }else if (shoppingAmount>=50_000){
            chargeMinutes -= 4*60;
        }else if (shoppingAmount>=30_000){
            chargeMinutes -= 3*60;
        }else {
            chargeMinutes -= 30;
        }


        int fee;
        if (chargeMinutes <= 0) {
            fee = 0;
        } else {
            fee = chargeMinutes / 10 * 1000;
        }

        // servlet 기반 MVC 돌릴때 req.setAttribute 와 같은 효과
        model.addAttribute("fee", fee);

        model.addAttribute("carNumber", carNumber);
        model.addAttribute("parkingTime", parkingTime);
        model.addAttribute("shoppingAmount", shoppingAmount);

        return "parking/result";
    }
}
