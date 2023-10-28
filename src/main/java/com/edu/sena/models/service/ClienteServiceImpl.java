package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.sena.models.entity.cliente;
import com.edu.sena.repository.ClienteRepository;
@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	ClienteRepository clienteRepository; 
	
	@Override
	public Optional<cliente> finById(Integer id) {
		
		return clienteRepository.findById(id);
	}

	@Override
	public List<cliente> finAll() {
		
		return clienteRepository.findAll();
	}

	@Override
	public cliente save(cliente e) {
		
		return clienteRepository.save(e);
	}

	@Override
	public void deleteById(Integer id) {
		
		clienteRepository.deleteById(id);
		
		
	}

}
