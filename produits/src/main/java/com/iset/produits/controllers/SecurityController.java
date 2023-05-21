package com.iset.produits.controllers;

import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

public class SecurityController {
    @GetMapping("/login")
    public String login()
    {
        return "login";
    }
    @GetMapping("/logout")
    public String logout(HttpServletRequest request) throws ServletException
    {
        request.logout();
        return "redirect:/login";
    }

}
