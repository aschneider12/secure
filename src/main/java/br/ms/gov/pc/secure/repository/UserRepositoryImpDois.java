package br.ms.gov.pc.secure.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class UserRepositoryImpDois //<T, ID extends Serializable> extends SimpleJpaRepository<T, ID> 
{

	// private final EntityManager entityManager;

	// UserRepositoryImpDois(JpaEntityInformation entityInformation, EntityManager entityManager) {
	// 	super(entityInformation, entityManager);

	// 	// Keep the EntityManager around to used from the newly introduced methods.
	// 	this.entityManager = entityManager;
	// }

	// @Transactional
	// public <S extends T> S salvarCustomizado(S entity) {
	// 	// implementation goes here
	// 	return null;
	// }
}
