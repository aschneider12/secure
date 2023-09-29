package br.ms.gov.pc.secure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("br.ms.gov.pc.secure.repository")
public class SecureApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureApplication.class, args);
	}
//
//    @Bean
//    EntityManagerFactory entityManagerFactory() {
//        return entityManagerFactory();
//    }

}
