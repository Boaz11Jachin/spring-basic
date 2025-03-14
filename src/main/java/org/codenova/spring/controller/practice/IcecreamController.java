package org.codenova.spring.controller.practice;

import org.codenova.spring.model.Icecream;
import org.codenova.spring.model.Movie;
import org.codenova.spring.repository.IcecreamRepository;
import org.codenova.spring.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/icecream")
public class IcecreamController {


    @Autowired
    private IcecreamRepository icecreamRepository;

    @RequestMapping("/create-proceed")
    public String createProceedHandle(@ModelAttribute Icecream icecream) {

        boolean result = icecreamRepository.create(icecream);

        System.out.println("create = " + result);
        return "icecream/create-proceed";
    }

    @RequestMapping("/form")
    public String FormHandle (){
        return "icecream/form";
    }

    @RequestMapping("/list")
    public String listHandle(Model model) {

        List<Icecream> icecreamList = icecreamRepository.findAll();
        model.addAttribute("icecreams", icecreamList);

        return "icecream/list";
    }

//    @RequestMapping("/detail")
//    public String detailHandel(@RequestParam("id") int id, Model model){
//
//        Icecream one = icecreamRepository.findById(id);
//        if(one==null){
//            return "redirect:/icecream/list";
//        }
//        model.addAttribute("found", one);
//        return "icecream/detail";
//    }


}
