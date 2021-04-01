package com.example.servingwebcontent.controllers.inactive;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FarewellController {

    @GetMapping("/farewell")
    public String farewell(@RequestParam(name="name", required=false, defaultValue="Mate") String name, Model model) {
        model.addAttribute("name", name);
        return "farewell";
    }

}
