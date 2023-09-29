package br.ms.gov.pc.secure.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

//@NoRepositoryBean
public class UserRepositoryImp<T, ID extends Serializable> extends SimpleJpaRepository<T, ID>
		implements ExtendedRepository<T, ID> {

//	private EntityManager entityManager;

//	@Autowired
//	private EntityManagerFactory entityManagerFactory;

	// There are two constructors to choose from, either can be used.
//	public UserRepositoryImp(Class<User> domainClass, EntityManager entityManager) {
//	  super(domainClass, entityManager);
//	  // This is the recommended method for accessing inherited class dependencies.
//	  this.entityManager = entityManager;
//	}
	private EntityManager entityManager;

	public UserRepositoryImp(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
		super(entityInformation, entityManager);
		
		this.entityManager = entityManager;
	}

	public T findFirst(){
		
		 CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		    CriteriaQuery<T> cQuery = builder.createQuery(getDomainClass());
		    Root<T> root = cQuery.from(getDomainClass());
		    cQuery
		      .select(root);
//		      .where(builder
//		        .like(root.<String>get(attributeName), "%" + text + "%"));
		    TypedQuery<T> query = entityManager.createQuery(cQuery);
		    return query.getSingleResult();
		
		
//		EntityManager em= super.getRepositoryMethodMetadata().
//		return null;
//		em.createNamedQuery("teste");
	}

	@Override
	public List<T> findByAttributeContainsText(String attributeName, String text) {
		// TODO Auto-generated method stub
		return null;
	}
}
