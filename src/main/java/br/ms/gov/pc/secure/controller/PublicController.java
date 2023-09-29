package br.ms.gov.pc.secure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ms.gov.pc.secure.model.User;
import br.ms.gov.pc.secure.service.UserService;

@RestController
@RequestMapping({"/public"})
public class PublicController {
	
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){

		return ResponseEntity.ok().body(service.findAll());
	}

}
