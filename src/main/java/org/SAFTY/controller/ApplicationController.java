package org.SAFTY.controller;
import jakarta.validation.Valid;
import org.SAFTY.models.Client;
import org.SAFTY.services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/HTML")
public class ApplicationController {
    private final ApplicationService applicationService;

    @Autowired
    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping()
    public String index(Model model) {
        return "HTML/index";
    }

    @GetMapping("/new")
    public String newPerson(@ModelAttribute("client") Client client) {
        return "HTML/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("client") @Valid Client client, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return "HTML/new";
        }
        applicationService.save(client);
        return "redirect:/HTML";
    }


}
