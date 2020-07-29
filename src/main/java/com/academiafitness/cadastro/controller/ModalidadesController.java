package com.academiafitness.cadastro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.academiafitness.cadastro.model.Modalidades;
import com.academiafitness.cadastro.repository.ModalidadesRepository;


@RestController
@RequestMapping("/api")
public class ModalidadesController {

	
	@Autowired
	private ModalidadesRepository modalidadesRepository;
	
	
	
	@GetMapping("/buscarmodalidades")
	public List<Modalidades> listarModalidades(){
		return modalidadesRepository.findAll();
	}
	
	
	@PostMapping("/adicionarmodalidades")
	@ResponseStatus(HttpStatus.CREATED)
	public Modalidades adicionarModalidades(@RequestBody Modalidades modalidades) {
		return modalidadesRepository.save(modalidades);
	}
	
	
	
	@PutMapping("/atualizarmodalidades/{modalidadesId}")
	public ResponseEntity<Modalidades> atualizar(@PathVariable long modalidadesId,
			@RequestBody Modalidades modalidades){
				if(!modalidadesRepository.existsById(modalidadesId)) {
					return ResponseEntity.notFound().build();
							
			}
				modalidades.setCodigo(modalidadesId);
				modalidades = modalidadesRepository.save(modalidades);
				return ResponseEntity.ok(modalidades);
				
	}			
	
	
	@DeleteMapping("/deletarmodalidades/{modalidadesId}")
	public ResponseEntity<Void> remover (@PathVariable long modalidadesId){
		if(!modalidadesRepository.existsById(modalidadesId)) {
			return ResponseEntity.notFound().build();
		}
		
		modalidadesRepository.deleteById(modalidadesId);
		return ResponseEntity.noContent().build();
	}
	
				
}		
