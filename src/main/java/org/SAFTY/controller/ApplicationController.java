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
//    @GetMapping("/new")
//    public String newPerson(@ModelAttribute("person") Application application) {
//        return "people/new";
//    }
//
//    @PostMapping()
//    public String create(@ModelAttribute("person") @Valid Application application, BindingResult bindingResult) {
//        if(bindingResult.hasErrors()){
//            return "people/new";
//        }
//        applicationDAO.save(person);
//        return "redirect:/people";
//    }
}
