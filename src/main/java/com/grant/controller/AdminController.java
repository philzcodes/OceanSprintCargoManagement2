package com.grant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.grant.Repository.ItemRepository;
import com.grant.model.Item;

@Controller
@RequestMapping("admin")
public class AdminController {

	@Autowired
	private ItemRepository itemRepo;
	
	@GetMapping("/")
    public String document(Model model) {
		model.addAttribute("listItems", itemRepo.findAll());
		
        return "index";
    }
	
	@GetMapping("/add")
    public String createItem(Model model) {
		Item item = new Item();
		model.addAttribute("item", item);
        return "save_item";
    }
	
	@PostMapping("/")
	public String save(@ModelAttribute("item") Item item) {
		 itemRepo.save(item);
		return "redirect:/admin/";
		}
		
	
	
	@GetMapping("/edit/{id}")
	public String editForm(@PathVariable Long id, Model model) {
		model.addAttribute("item", itemRepo.findById(id).get());
		return "edit_item";
	}

	@PostMapping("/{id}")
	public String update(@PathVariable Long id, @ModelAttribute("item") Item item) {
		Item existingItem = itemRepo.findById(id).get();
		existingItem.setId(id);
		existingItem.setSenderName(item.getSenderName());
		existingItem.setTrackingId(item.getTrackingId());
		existingItem.setDestination(item.getDepartedTime());
		existingItem.setDepartedTime(item.getDepartedTime());
		existingItem.setComment(item.getComment());
		existingItem.setTotalFreight(item.getTotalFreight());
		existingItem.setStatus(item.getStatus());
		

		itemRepo.save(existingItem);
		return "redirect:/admin/";
	}
	
	@GetMapping("/{id}")
	public String delete(@PathVariable Long id) {
		itemRepo.deleteById(id);
		return "redirect:/admin/";
	}
		
}
