package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import dmacc.beans.Merchandise;
import dmacc.repository.MerchandiseRepository;

@Controller
public class MerchandiseController {

    @Autowired
    private MerchandiseRepository merchandiseRepository;

    @GetMapping("/merchandise")
    public String viewAllMerchandise(Model model) {
        model.addAttribute("merchandise", merchandiseRepository.findAll());
        return "merchandise";
    }

    @GetMapping("/merchandiseViewAll")
    public String merchandiseViewAll() {
        return "merchandiseViewAll";
    }

    @GetMapping("/addMerchandise")
    public String addMerchandiseForm(Model model) {
        model.addAttribute("merchandise", new Merchandise());
        return "addMerchandise";
    }

    @PostMapping("/addMerchandise")
    public String addMerchandise(Merchandise merchandise, Model model) {
        merchandiseRepository.save(merchandise);
        return "redirect:/addSuccess";
    }

    @GetMapping("/addSuccess")
    public String addSuccess() {
        return "addSuccess";
    }
}

 