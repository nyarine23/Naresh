package com.wipro.firstapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	@GetMapping("/list")
	public String list (){
		return"Student list";
	}
	@GetMapping("/get")
	public String get (@RequestParam(value ="name")String studentName,@RequestParam(value = "age")int studentAge){
		String str = studentName+":"+studentAge;
		return str;
		
	}
	@GetMapping("/feesCalculate")
	public String calculate (@RequestParam(value ="college")float collegefees,@RequestParam(value = "transport")float transport, @RequestParam(value = "canteen")float canteen){
		float total = collegefees+transport+canteen;
		return "fees : "+total;
	}
	@GetMapping("/get2/{name}/{age}")
	public String get2 (@PathVariable(value ="name")String studentName,@PathVariable(value ="age")int studentAge){
		String str = studentName+":"+studentAge;
		return str;
		
	}
	


}
 