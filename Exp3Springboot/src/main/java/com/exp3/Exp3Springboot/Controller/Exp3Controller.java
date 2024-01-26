package com.exp3.Exp3Springboot.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exp3.Exp3Springboot.Domain.Exp3;
import com.exp3.Exp3Springboot.Service.Exp3Service;
	
@RestController
@RequestMapping("/welcome")
public class Exp3Controller {
		
		Exp3Service exp3Service;
		
			
		public Exp3Controller(Exp3Service exp3Service) {
			super();
			this.exp3Service = exp3Service;
		}

		//Read Specific Exp3 Details
		@GetMapping("{id}")
		public Exp3 getExpDetails(@PathVariable("id") String id)
		{
			return exp3Service.getExp3(id);		
		}
		
		//Read all Exp3 details from DB
		@GetMapping()
		public List<Exp3> getAllExpDetails()
		{
			return exp3Service.getAllExp3();		
		}
		
		
		@PostMapping
		public String CreateExpDetails(@RequestBody  Exp3 exp3)
		{
			exp3Service.createExp3(exp3);
			return "Creted Successfully";
		}
		
		@PutMapping
		public String updateExpDetails(@RequestBody  Exp3 exp3)
		{
			exp3Service.updateExp3(exp3);
			return "Updated Successfully";
		}
		
		@DeleteMapping("{id}")
		public String deleteExpDetails(@PathVariable("id") String id)
		{
			exp3Service.deleteExp3(id);
			return "Deleted Successfully";
		}

}
