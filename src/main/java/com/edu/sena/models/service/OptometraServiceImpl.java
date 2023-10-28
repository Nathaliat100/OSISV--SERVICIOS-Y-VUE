package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.sena.models.entity.optometra;
import com.edu.sena.repository.OptometraRepository;

@Service
public class OptometraServiceImpl implements OptometraService{
	
	@Autowired 
	OptometraRepository optometraRepository;
	
	@Override
	public Optional<optometra> findById(Integer id) {
	
		return optometraRepository.findById(id);
	}
	@Override
	public List<optometra> finAll() {
		
		return optometraRepository.findAll();
	}
	@Override
	public optometra save(optometra e) {
		
		return optometraRepository.save(e);
	}
	@Override
	public void deleteById(Integer id) {
		
		 optometraRepository.deleteById(id);		
	}
	
}
