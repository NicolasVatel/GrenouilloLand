package modele;

public class Grenouille 
{
	private int ptVie;
	private boolean malade;
	private Position position;
	
	public Grenouille()
	{
		position = new Position(9,0);
		ptVie = 1;
		malade=false;
	}
	
	public int getPtVie()
	{
		return ptVie;
	}
	
	public void setPtVie(int ptVie)
	{
		this.ptVie = ptVie;
	}
	
	public void ajouteVie()
	{
		ptVie++;
	}
	
	public Position getPosition()
	{
		return position;
	}
	
	public boolean estMalade()
	{
		return malade == true;
	}
}
