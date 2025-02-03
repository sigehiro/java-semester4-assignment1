package com.example.Assignment1.controllers;

import com.example.Assignment1.models.Cloth;
import com.example.Assignment1.services.ClothService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cloth")
public class ClothController {

    @Autowired
    private ClothService clothService;

//    @GetMapping("/home")
//    public String home() {
//        return "home";
//    }

    @GetMapping("/menu")
    public String menu(Model model) {
        model.addAttribute("clothes", clothService.getAllClothes());
        model.addAttribute("newCloth", new Cloth());
        return "menu";
    }

    @PostMapping("/add")
    public String addCloth(@ModelAttribute("newCloth") Cloth cloth, Model model) {
        List<String> errors = validateCloth(cloth);

        if (!errors.isEmpty()) {
            model.addAttribute("clothes", clothService.getAllClothes());
            model.addAttribute("errors", errors);
            return "menu";
        }

        clothService.addCloth(cloth);
        return "redirect:/cloth/menu";
    }

    private List<String> validateCloth(Cloth cloth) {
        List<String> errors = new ArrayList<>();

        if (cloth.getPrice() <= 1000) {
            errors.add("Price should be more than 1000.");
        }
        if (cloth.getBrand() == null) {
            errors.add("Brand is mandatory and should be one of the list.");
        }
        if (cloth.getYear() <= 2021) {
            errors.add("Year should be more than 2021.");
        }

        return errors;
    }
}
