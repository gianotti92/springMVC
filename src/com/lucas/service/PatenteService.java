package com.lucas.service;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.lucas.model.Patente;

public class PatenteService {
	Map<String,Patente> db = new HashMap<String,Patente>();
	List<Patente> patentes;

	public void save(Patente patente) {
		db.put(patente.getNumeroDominio(), patente);		
	}
	
	public List<Patente> getAll(){
		patentes = new ArrayList<>();
		for(int i=0;i<db.size();i++){
			patentes.add(db.get(i));
		}
		return patentes;
	} 

	

}
