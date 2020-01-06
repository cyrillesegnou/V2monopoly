package fr.gtm.monopoly;

public class Impots extends Case {
	private int somme = 500 ;
	
	public Impots() {
		super("Impots");
		// TODO Auto-generated constructor stub
	}
@Override
	public void arreter(Pion p) {
		super.arreter(p);
		Joueur j =  p.getJoueur();
		j.debiter(somme);
}


}
