package com.agiraud.charon.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	/* ************************************************************************* */
	// REQUEST MAPPING
	/* ************************************************************************* */
    @RequestMapping("/login")
    public String login() {
        return "form-login";
    }

    @RequestMapping("/login-error")
    public String loginError(Model model) {
        model.addAttribute("error", "Wrong.login");
        return "form-login";
    }
}
