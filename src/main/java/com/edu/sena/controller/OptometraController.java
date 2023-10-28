package com.edu.sena.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.sena.models.entity.optometra;
import com.edu.sena.models.service.OptometraService;

@RestController
@RequestMapping("/api/optometras")
public class OptometraController {

	@Autowired
	OptometraService optometraService;
	
	@GetMapping("{id}")
	public Optional<optometra> buscarPorId(@PathVariable Integer id){
		
		return optometraService.findById(id);
	}
	@GetMapping("/listar")
	public List<optometra> listartodos(){
		
		return optometraService.finAll();
	}
	@PostMapping
	public optometra guardar(@RequestBody optometra e) {
		return optometraService.save(e);
		
	}
	@DeleteMapping("/{id}")
	private void eliminar(@PathVariable Integer id) {
		optometraService.deleteById(id);
	}
	@PutMapping("/actualizar/{id}")
	public optometra actualizar(@RequestBody optometra e,@PathVariable Integer id) {
		
		optometra cEBD=optometraService.findById(id).get();
		          
		          cEBD.setNombre(e.getNombre());
		          cEBD.setTelefono(e.getTelefono());
		          cEBD.setCorreo(e.getCorreo());
		          cEBD.setDireccion(e.getDireccion());
		          cEBD.setGenero(e.getGenero());
		          cEBD.setContraseña(e.getContraseña());
		          
		          optometraService.save(cEBD);
		          return e;
	}
	
}
