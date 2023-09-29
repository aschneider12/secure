package br.ms.gov.pc.secure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ms.gov.pc.secure.model.User;
import br.ms.gov.pc.secure.service.UserService;

@RestController
@RequestMapping({"/imple"})
public class ImpleController {
	
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<User> findAll(){

		return ResponseEntity.ok().body(service.findPersonalisado());
	}

}
