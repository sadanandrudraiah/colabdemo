package com.cruds.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cruds.entity.User;
import com.cruds.services.UserService;

@Controller
public class UserController {

		@Autowired
		private UserService userService;
		
		@RequestMapping(value = "user.html", method= RequestMethod.GET)
		public String ShowFarm(Model model)
		{
			model.addAttribute("command", new User());
			model.addAttribute("USERLIST", userService.getAll());
			return "user";	
		}
		
		@RequestMapping(value= "user.html", method= RequestMethod.POST)
		public String doUser(@ModelAttribute ("user") User u)
		{
			userService.create(u);
			System.out.println(u);
			return "redirect:user.html";
		}
		
		@RequestMapping(value= "/user-del-{id}", method= RequestMethod.GET)
		public String delUser(@PathVariable("id") Long id)
		{
			userService.delete(id);
			System.out.println("Deleting User Id " + id);
			return "redirect:user.html";
		}
		
		@RequestMapping(value="/user-edit-{userId}", method=RequestMethod.GET)
		public String findByuserId(@PathVariable("userId") String userId,Model model)
		{
			model.addAttribute("command",userService.findByuserId(userId));
			return "editUser";
		}
		
		@RequestMapping(value="editUser.html", method=RequestMethod.POST)
		public String updateUser(@ModelAttribute("user") User u)
		{
			userService.update(u);
			return "redirect:user.html";
		}
		
}
