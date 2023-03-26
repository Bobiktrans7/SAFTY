package org.SAFTY.controller;
import jakarta.validation.Valid;
import org.SAFTY.dao.ApplicationDAO;
import org.SAFTY.models.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/HTML")
public class ApplicationController {
    private final ApplicationDAO applicationDAO;

    @Autowired
    public ApplicationController(ApplicationDAO applicationDAO) {
        this.applicationDAO = applicationDAO;
    }

    @GetMapping()
    public String index(Model model) {
        return "HTML/index";
    }

    @GetMapping("/new")
    public String newPerson(@ModelAttribute("application") Application application) {
        return "HTML/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("application") @Valid Application application, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return "HTML/new";
        }
        applicationDAO.save(application);
        return "redirect:/HTML";
    }


}
