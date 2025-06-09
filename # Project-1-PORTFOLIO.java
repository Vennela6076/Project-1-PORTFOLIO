# Project-1-PORTFOLIO
package com.portfolio.controller;

import com.portfolio.model.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/projects")
    public String projects(Model model) {
        List<Project> projectList = List.of(
            new Project("Java Blog App", "A blog application built using Spring Boot."),
            new Project("E-Commerce Site", "Full-stack Java web application with Spring and MySQL.")
        );
        model.addAttribute("projects", projectList);
        return "projects";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}