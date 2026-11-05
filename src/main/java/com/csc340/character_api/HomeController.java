package com.csc340.character_api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String redirectToCharacters() {
        return "redirect:/characters";
    }

    @GetMapping("/about")
    public String aboutPage() {
        return "about";
    }
}
