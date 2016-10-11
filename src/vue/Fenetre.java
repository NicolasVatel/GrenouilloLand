package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import presenter.Presenter;

import modele.Grenouille;
import modele.Position;

public class Fenetre extends JFrame
{	
	public static Presenter presenter;
	
	private JMenuBar menu = new JMenuBar();
	private JMenu nouvellePartie = new JMenu("Nouvelle partie");
	private JMenu lancerPartie = new JMenu("Lancer une partie");
	private JMenu aPropos = new JMenu("A propos");
	private JMenu quitter = new JMenu("Quitter");
	
	private Vie vie = new Vie();
	private Grille grille = new Grille();
	
	public Fenetre()
	{
		setTitle("GrenouilloLand");
		setSize(1000,600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		menu();

		add(vie, BorderLayout.WEST);
		add(grille, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	public void menu()
	{
		menu.add(nouvellePartie);
		menu.add(lancerPartie);
		menu.add(aPropos);
		menu.add(quitter);
		setJMenuBar(menu);
	}
	
	public Vie getVie()
	{
		return vie;
	}
	
	public static void main(String[] args)
	{
		new Fenetre();
	}
	public void setPresenter(Presenter pres)
	{
		presenter = pres;
		presenter.afficherVie();
		revalidate();
		repaint();
	}
	
	public Presenter getPresenter()
	{
		return presenter;
	}
}

