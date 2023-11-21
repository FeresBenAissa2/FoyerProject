package tn.esprit.foyerferesbenaissa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tn.esprit.foyerferesbenaissa.dao.entites.Universite;

@SpringBootApplication
public class FoyerFeresBenAissaApplication {

	public static void main(String[] args) {

		SpringApplication.run(FoyerFeresBenAissaApplication.class, args);

		Universite univ = Universite.builder().idUniversite(1).nomUniversite("test").address("ss").build();
	}

}
