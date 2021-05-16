package com.store;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AfterDomainEventPublication;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@Autowired
	private UserRepository repo;
	
	@Autowired
	private ItemRepository itemrepo;
	
	@RequestMapping("/")
	public String home(ModelMap model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		model.addAttribute("loggeduser", auth.getName());
		User user = repo.findByUsername(auth.getName());
		
		List<Item> itemholder = new ArrayList<Item>();
		
		//new arrivals
		if(user.getCustomer().equals("a")) {
			if(user.getGender().equals("m")) {
				itemholder = itemrepo.findAllByOrderByNewarrivalDescGenderDescDiscountpriceAsc();
			}else {
				itemholder = itemrepo.findAllByOrderByNewarrivalDescGenderAscDiscountpriceAsc();
			}
		}else {
			if(user.getGender().equals("m")) {
				itemholder = itemrepo.findAllByOrderByDiscountedDescGenderDescDiscountpriceAsc();
			}else {
				itemholder = itemrepo.findAllByOrderByDiscountedDescGenderAscDiscountpriceAsc();
			}
		}
		
		//List<Item> itemholder = itemrepo.findAll();
		
		model.addAttribute("items", itemholder);
		
		return "home.jsp";
	}
	
	@RequestMapping("/search")
	public String searchbar(String searchkey,ModelMap model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		model.addAttribute("loggeduser", auth.getName());
		
		User user = repo.findByUsername(auth.getName());
		
		List<Item> holder= new ArrayList<Item>();
		
		if(user.getGender().equals("m")) {
			holder = itemrepo.findByProductOrderByGenderDescDiscountpriceAsc(searchkey);
		}else {
			holder = itemrepo.findByProductOrderByGenderAscDiscountpriceAsc(searchkey);
			
		}
		
		model.addAttribute("items", holder);
		
		return "home.jsp";
	}
	
	@RequestMapping("/login")
	public String loginPage() {
		return "login.jsp";
	}
	
	@RequestMapping("/logout-success")
	public String logoutPage() {
		return "login.jsp";
	}
	
	@RequestMapping(value ="/reg")
	public String registration() {
		return "registration.jsp";
	}
	
	@RequestMapping(value="/addUser",method = RequestMethod.POST)
	public String addUser(User user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		user.setPassword(encoder.encode(user.getPassword()));
		repo.save(user);
		return "login.jsp";
	}
	
	@RequestMapping(value ="/itempool")
	public String itempools() {
		return "additem.jsp";
	}
	
	@RequestMapping(value="/addItem",method = RequestMethod.POST)
	public String addItem(Item item) {
		
		itemrepo.save(item);
		
		return "additem.jsp";
	}

}
