package dev.paulmatthews.todomvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // GET / -> http://localhost:8080 || http://localhost:8080/
    @GetMapping
    public String getIndex() {
        return "home";
    }
}
