package fr.gtm.monopoly;

public class Joueur {
	private String nom;
	private Pion pion;
	private int solde = 1500 ;
	public Joueur(String nom) {
		this.nom = nom;
	}
		public Joueur(String nom, Pion pion) {
		this.nom = nom;
		this.pion = pion;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public Pion getPion() {
		return pion;
	}
	public void setPion(Pion pion) {
		this.pion = pion;
	}

	public void jouer(Gobelet gobelet) {
		gobelet.lancer();
		int r = gobelet.getValeur();
		pion.avancer(r);
	}
	public int getSolde() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}
	public void crediter(int somme) {
		solde += somme;	
	}
	public void debiter (int somme) {
		solde -= somme ;
	}
	@Override
	public String toString() {
		return "Joueur [" + nom + ", solde=" + solde + "]";
	}

	
	
}
