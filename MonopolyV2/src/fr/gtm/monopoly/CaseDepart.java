package fr.gtm.monopoly;

public class CaseDepart extends Case {

	private int somme = 250;
	
	public CaseDepart() {
		super("depart");
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void survoler(Pion p) {
		Joueur j =  p.getJoueur();
		j.crediter(somme);
	}
	
	@Override
	public void arreter(Pion p) {
		Joueur j =  p.getJoueur();
		j.crediter(somme*2);
	}
	

}