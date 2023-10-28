package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import com.edu.sena.models.entity.optometra;

public interface OptometraService {
	
	public Optional<optometra> findById(Integer id);
	public List<optometra> finAll();
	public optometra save(optometra e);
	public void deleteById(Integer id);


}
