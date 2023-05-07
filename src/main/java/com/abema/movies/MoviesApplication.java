package com.abema.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MoviesApplication {
    @RequestMapping("/root")
    public String root(){
        return "Hello World!";
    }


    public static void main(String[] args) {
        SpringApplication.run(MoviesApplication.class, args);
    }

}
