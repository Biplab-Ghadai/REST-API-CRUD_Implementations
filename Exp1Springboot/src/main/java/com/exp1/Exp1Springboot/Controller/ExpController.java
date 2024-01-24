package com.exp1.Exp1Springboot.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exp1.Exp1Springboot.domain.Exp;

@RestController
@RequestMapping("/home")
public class ExpController {
	
	Exp exp;
		
	@GetMapping("{id}")
	public Exp getExpDetails(String id)
	{
		return exp;
				//new Exp("id1", "Biplab", "Ad1", "766565");
	}
	
	@PostMapping
	public String CreateExpDetails(@RequestBody  Exp exp)
	{
		this.exp = exp;
		return "Creted Successfully";
	}
	
	@PutMapping
	public String updateExpDetails(@RequestBody  Exp exp)
	{
		this.exp = exp;
		return "Updated Successfully";
	}
	
	@DeleteMapping("{id}")
	public String deleteExpDetails(String id)
	{
		this.exp = null;
		return "Deleted Successfully";
	}
	
	
}
