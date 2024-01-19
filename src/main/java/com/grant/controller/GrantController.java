package com.grant.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.grant.Repository.ItemRepository;


@Controller
public class GrantController {

	@Autowired
	private ItemRepository itemRepo;
	
	@GetMapping("/")
    public String document() {
        return "indexMain";
    }
	
	@GetMapping("/index.html")
    public String documen() {
        return "indexMain";
    }
	
	@GetMapping("/about.html")
    public String about() {
        return "about";
    }
	
	@GetMapping("/service.html")
    public String service() {
        return "service";
    }
	@GetMapping("/contact.html")
    public String contact() {
        return "contact";
    }
	  
    @GetMapping("/login")
    public String login() {
        return "login";
    }
	
	@GetMapping("/logout")
	public String logout() {
		return "logout";
	}
	
	@GetMapping("/search/{id}")
	public String search(@PathVariable String id, Model model) {

		model.addAttribute("item", itemRepo.findByTrackingId(id));
		return "item_details";
	}
	
	
}
