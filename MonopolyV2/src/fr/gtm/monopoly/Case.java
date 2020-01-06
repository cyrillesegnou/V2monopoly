package fr.gtm.monopoly;

public class Case {
	private String nom;
	private Case suivante;
	
	public Case(String nom) {
		this.nom = nom;
	}
	
	public void survoler(Pion p) {
		System.out.println("SURVOL de "+nom+" par "+p.getNom());
	}
	
	public void arreter(Pion p) {
		System.out.println("ARRET sur "+nom+" par "+p.getNom());
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Case getSuivante() {
		return suivante;
	}
	public void setSuivante(Case suivante) {
		this.suivante = suivante;
	}
	
	

}
