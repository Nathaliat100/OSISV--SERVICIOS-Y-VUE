package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;
import com.edu.sena.models.entity.cliente;

public interface ClienteService {
	
	public Optional<cliente> finById(Integer id);
	public List<cliente> finAll();
	public cliente save(cliente e);
	public void deleteById(Integer id);
	

}
