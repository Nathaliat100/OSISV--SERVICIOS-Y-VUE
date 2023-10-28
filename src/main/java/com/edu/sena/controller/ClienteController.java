package com.edu.sena.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.edu.sena.models.entity.cliente;
import com.edu.sena.models.service.ClienteService;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	
	@GetMapping("/{id}")
	public Optional<cliente> buscarPorId(@PathVariable Integer id ){
		
		return clienteService.finById(id);
	}
	@GetMapping("/listar")
	public List<cliente> listartodo(){
		
		return clienteService.finAll();
	}
	
	@PostMapping
	public cliente guardar(@RequestBody cliente e) {
		
		return clienteService.save(e);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		
		clienteService.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public cliente actualizar(@RequestBody cliente e, @PathVariable Integer id) {
		
		cliente cEBD=clienteService.finById(id).get();
				
				cEBD.setNombre(e.getNombre());
				cEBD.setTipo_documento(e.getTipo_documento());
				cEBD.setNumero_de_documento(e.getNumero_de_documento());
				cEBD.setTelefono(e.getTelefono());
				cEBD.setDireccion(e.getDireccion());
				cEBD.setCorreo(e.getCorreo());
				cEBD.setEstado_civil(e.getEstado_civil());
				cEBD.setEPS(e.getEPS());
				cEBD.setContraseña(e.getContraseña());
				
				clienteService.save(cEBD);
				return e;
	}
}
