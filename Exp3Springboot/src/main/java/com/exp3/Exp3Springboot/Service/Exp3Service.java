package com.exp3.Exp3Springboot.Service;

import java.util.List;

import com.exp3.Exp3Springboot.Domain.Exp3;

public interface Exp3Service {
	
	public String createExp3(Exp3 exp3);
	public String updateExp3(Exp3 exp3);
	public String deleteExp3(String id);
	public Exp3 getExp3(String id);
	public List<Exp3> getAllExp3();
	
}
