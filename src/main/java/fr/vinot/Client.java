package fr.vinot;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the client database table.
 * 
 */
@Entity
@NamedQuery(name="Client.findAll", query="SELECT c FROM Client c")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String adresse;

	private String email;

	private String nom;

	private String prenom;

	private String ville;

	public Client() {
	}
	
	

	public Client(String adresse, String email, String nom, String prenom, String ville) {
		super();
		this.adresse = adresse;
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.ville = ville;
	}



	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", adresse=" + adresse + ", email=" + email + ", nom=" + nom + ", prenom=" + prenom
				+ ", ville=" + ville + "]";
	}
	
	

}