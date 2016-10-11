package presenter;

import vue.Fenetre;
import vue.Vie;
import modele.Grenouille;

public class Presenter {
	private Grenouille gr;
	private Fenetre fen;
	public Presenter(Grenouille gr, Fenetre fen)
	{
		this.gr=gr;
		this.fen=fen;
	}
	
	public void changerVie()
	{
		gr.ajouteVie();
		fen.getVie().ptVie.setText(""+gr.getPtVie());
	}
	
	public void afficherVie()
	{
		fen.getVie().ptVie.setText(""+gr.getPtVie());
	}
}
