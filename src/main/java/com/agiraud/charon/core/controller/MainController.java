package com.agiraud.charon.core.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Application home page and login.
 */
@Controller
public class MainController {
	/* ************************************************************************* */
	// REQUEST MAPPING
	/* ************************************************************************* */
    @RequestMapping("/")
    public String root(Locale locale) {
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
