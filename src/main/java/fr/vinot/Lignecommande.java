package fr.vinot;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the lignecommande database table.
 * 
 */
@Entity
@NamedQuery(name="Lignecommande.findAll", query="SELECT l FROM Lignecommande l")
public class Lignecommande implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int quantite;


	//uni-directional many-to-one association to Produit
	@ManyToOne
	@JoinColumn(name="referenceProduit")
	private Produit produit;

	public Lignecommande() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantite() {
		return this.quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}


	public Produit getProduit() {
		return this.produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

}