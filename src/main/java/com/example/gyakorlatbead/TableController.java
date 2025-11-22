package com.example.gyakorlatbead;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TableController {
    @Autowired private ArRepo ArRepo;
    @Autowired private TartalomRepo TartalomRepo;
    @Autowired private SutiRepo SutiRepo;

    @GetMapping("/kinalat")
    public String arLista(Model model) {
        model.addAttribute("arak", ArRepo.findAll());
        model.addAttribute("tartalom", TartalomRepo.findAll());
        model.addAttribute("suti", SutiRepo.findAll());
        return "kinalat";
    }
    }
