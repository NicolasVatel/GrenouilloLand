package vue;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import presenter.Presenter;

import modele.Grenouille;
import modele.Position;

public class Grille extends JPanel implements ActionListener{
	
	private JButton bouton[][] = new JButton[10][10];
	private Vie vie = new Vie();
	  public Grille()
	  {
		  	setLayout(new GridLayout(10, 10));
		    for(int i = 0; i < 10; i++)
		    {
		    	for(int j = 0; j < 10; j++)
		    	{
		    		bouton[i][j] = new JButton();
		    		bouton[i][j].addActionListener(this);
		    		bouton[i][j].setIcon(new ImageIcon("Icones/mosaique.jpg"));
		        
		    		add(bouton[i][j]);
		    	}
		    }
		    bouton[9][0].setIcon(new ImageIcon("Icones/grenouille.gif"));
	   }

	public void actionPerformed(ActionEvent e) {
		((JButton)e.getSource()).setIcon(new ImageIcon("Icones/grenouille.gif"));
		//new ImageIcon(imageCoeur.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		Fenetre.presenter.changerVie();
		
	}
}
