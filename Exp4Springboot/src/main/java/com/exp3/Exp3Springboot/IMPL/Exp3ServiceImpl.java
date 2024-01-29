package com.exp3.Exp3Springboot.IMPL;

import java.util.List;

import org.springframework.stereotype.Service;

import com.exp3.Exp3Springboot.Domain.Exp3;
import com.exp3.Exp3Springboot.Exception.Exp3NotFoundException;
import com.exp3.Exp3Springboot.Repository.Exp3Repository;
import com.exp3.Exp3Springboot.Service.Exp3Service;

@Service
public class Exp3ServiceImpl implements Exp3Service{

	Exp3Repository exp3Repository;
	
	public Exp3ServiceImpl(Exp3Repository exp3Repository) {
		super();
		this.exp3Repository = exp3Repository;
	}

	@Override
	public String createExp3(Exp3 exp3) {
		
		exp3Repository.save(exp3);
		
		return "Success";
	}

	@Override
	public String updateExp3(Exp3 exp3) {
		
		exp3Repository.save(exp3);
		
		return "Success";
	}

	@Override
	public String deleteExp3(String id) {
		
		exp3Repository.deleteById(id);
		return "Success";
	}

	@Override
	public Exp3 getExp3(String id) {
		
			if(exp3Repository.findById(id).isEmpty())
			{
				throw new Exp3NotFoundException("The Requested Exp3 does not exist");
			}
			return exp3Repository.findById(id).get();
	}

	@Override
	public List<Exp3> getAllExp3() {

		return exp3Repository.findAll();
	}

}
