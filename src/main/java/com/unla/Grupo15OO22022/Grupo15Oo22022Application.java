package com.unla.Grupo15OO22022;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Grupo15Oo22022Application {

public static void main(String[] args) {
SpringApplication.run(Grupo15Oo22022Application.class, args);
}

@GetMapping("/grupo-15")
public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
return String.format("Hello %s!", name);
}
}