package fr.gtm.monopoly;

public class TaxeDeLuxe extends Case {
	int somme = 350 ;
	public TaxeDeLuxe() {
		super("Taxe de luxe");
}
	@Override
	public void arreter(Pion p) {
		super.arreter(p);
		Joueur j =  p.getJoueur();
		j.crediter(somme);
}
}