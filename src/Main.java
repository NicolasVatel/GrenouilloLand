import modele.Grenouille;
import presenter.Presenter;
import vue.Fenetre;


public class Main
{
	public static void main(String [] args)
	{
		Fenetre fen = new Fenetre();
		fen.setPresenter(new Presenter(new Grenouille(),fen));
	}
}
