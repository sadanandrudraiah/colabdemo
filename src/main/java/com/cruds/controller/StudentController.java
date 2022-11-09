package com.cruds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cruds.entity.Student;
import com.cruds.services.StudentService;
import com.mysql.fabric.xmlrpc.base.Value;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="student.html",method=RequestMethod.GET)
	public String showForm(Model model)
	{
		model.addAttribute("command", new Student());
		model.addAttribute("STUDENTLIST", studentService.getAll());
		return "student";
	}
	@RequestMapping(value="student.html",method=RequestMethod.POST)
	public String doStudent(@ModelAttribute("student") Student s)
	{
		studentService.create(s);
		System.out.println(s);
		return "redirect:student.html";
	}
	
	@RequestMapping(value="/student-del-{rollNum}",method=RequestMethod.GET)
	public String delete(@PathVariable("rollNum") int rollNum )
	{
		studentService.delete(rollNum);
		System.out.println("deleting rollNum" + rollNum);
		return "redirect:student.html";
	}
	
	@RequestMapping(value="/student-edit-{rollNum}",method=RequestMethod.GET)
	public String edit(@PathVariable("rollNum") int rollNum,Model model )
	{
		model.addAttribute("command",studentService.edit(rollNum));
		return "editstudent";
	}
	@RequestMapping(value="editStudent.html" , method=RequestMethod.POST)
	public String updateStudent(@ModelAttribute("student") Student s)
	{
		studentService.update(s);
		return "redirect:student.html";
	}
}
