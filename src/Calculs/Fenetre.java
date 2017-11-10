package Calculs;
import javax.swing.JFrame;

public class Fenetre 
{
	public static void main(String[] args)
	{
		Graphique graph = new Graphique();
		graph.setVisible(true);
		graph.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		graph.setSize(400, 150);
	}
}
