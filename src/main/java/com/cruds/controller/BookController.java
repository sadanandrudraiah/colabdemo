package com.cruds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cruds.entity.Book;


@Controller
public class BookController {
	
	@Autowired
//	private BookService bookService;
	
	@RequestMapping(value="book.html" , method=RequestMethod.GET)
	public String showForm(Model model)
	{
		model.addAttribute("command", new Book());
	//	model.addAttribute("BOOKLIST", bookService.getAll());
		return "book";
	}
	
	@RequestMapping(value="book.html" , method=RequestMethod.POST)
	public String doBook(@ModelAttribute("book") Book b )
	{
	//	bookService.create(b);
		System.out.println(b);
		return "redirect:book.html";
	}
	
	@RequestMapping(value="/del-{ISBN}", method=RequestMethod.GET)
	public String deleteBId(@PathVariable("ISBN") int ISBN)
	{
	//	bookService.delete(ISBN);
		System.out.println("deleting id " + ISBN);
		return "redirect:book.html";
	}
	
	@RequestMapping(value="/edit-{bId}", method=RequestMethod.GET)
	public String editBId(@PathVariable("ISBN") int bId,Model model)
	{
	//	model.addAttribute("command",bookService.edit(bId));
		return "editbook";
	}
	
	@RequestMapping(value="editBook.html" , method=RequestMethod.POST)
	public String updateBook(@ModelAttribute("book") Book b )
	{
		
	//	bookService.update(b);
		return "redirect:book.html";
	}


}
