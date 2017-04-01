package fr.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.vinot.Client;

public interface ClientDao extends JpaRepository<Client, Integer>{
	@Query("select c from Client c where nom = ?1 and prenom = ?2")
	public Client getClientFromNom(String nom, String prenom);
}
