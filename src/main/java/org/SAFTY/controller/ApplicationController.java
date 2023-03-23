package org.SAFTY.controller;
import org.SAFTY.dao.ApplicationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
}
