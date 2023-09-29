package br.ms.gov.pc.secure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ms.gov.pc.secure.model.User;

//@Repository desenecessario pois ja extende de jparepo
public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsername(String username);
}
