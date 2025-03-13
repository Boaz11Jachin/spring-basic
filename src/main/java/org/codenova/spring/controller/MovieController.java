package org.codenova.spring.controller;

import lombok.AllArgsConstructor;
import org.codenova.spring.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movie")
@AllArgsConstructor
public class MovieController {

    /*
    @Autowired
    private MovieRepository movieRepository;
    */

    private MovieRepository movieRepository;

    /*
    public MovieController(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }
    */


    @RequestMapping("/list")
    public String movieListHandle(){
        System.out.println(movieRepository);



        return "movie/list";
    }

}
