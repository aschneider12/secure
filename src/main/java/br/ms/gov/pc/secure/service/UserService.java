package br.ms.gov.pc.secure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ms.gov.pc.secure.model.User;
import br.ms.gov.pc.secure.repository.UserRepositoryImp;

@Component
public class UserService {

//	@Autowired
//	private UserRepository repository;
	
	@Autowired
	private UserRepositoryImp<User, Long> repositoryImp;

//	@Autowired
//	private UserRepositoryImpDois<User, Long> repositoryImp;
	
	
	public List<User> findAll() {
		return null;
//		return repository.findAll();
	}

	public User findPersonalisado() {
		return null;
//		return repositoryImp.findFirst();
	}
	
}
