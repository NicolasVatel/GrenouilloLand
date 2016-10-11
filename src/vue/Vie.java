package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import presenter.Presenter;

import modele.Grenouille;
import modele.Position;

public class Vie extends JPanel{
	
	private JPanel vie = new JPanel();
	private JLabel coeur = new JLabel("");
	public JLabel ptVie = new JLabel("");
	private ImageIcon imageCoeur = new ImageIcon("Icones/coeur.png");
	private ImageIcon dimension; 
	
	public Vie()
	{
		dimension = new ImageIcon(imageCoeur.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		coeur.setIcon(dimension);
		vie.add(coeur);
		vie.add(ptVie);
		vie.setBackground(Color.gray);
		vie.setPreferredSize(new Dimension(200, 1000));
		vie.repaint();
		add(vie, BorderLayout.WEST);
		
		setVisible(true);
	}
	
}
