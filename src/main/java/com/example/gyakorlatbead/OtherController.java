package com.example.gyakorlatbead;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OtherController {

    private final UzenetRepo uzenetRepo;
    public OtherController(UzenetRepo uzenetRepo) {
        this.uzenetRepo = uzenetRepo;
    }

    @GetMapping("/kapcsolat")
    public String urlapForm(Model model) {
        model.addAttribute("message", new Message());
        return "kapcsolat";
    }

    @PostMapping("/kapcsolatk")
    public String urlapSubmit(
            @Valid @ModelAttribute Message message, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "kapcsolat";
        }
        Uzenet uzenet = new Uzenet(message.getName(), message.getTopic(), message.getContent());
        uzenetRepo.save(uzenet);

        model.addAttribute("attr2", message);

        return "eredmeny";
    }


}
