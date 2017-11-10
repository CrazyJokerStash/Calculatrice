package Calculs;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")

public class Graphique extends JFrame implements ActionListener
{	
	private JTextField chiffre1, chiffre2, resultat;
	private JButton Addition, Soustraction, Division, Multiplication;
	float i = 0;
	float e = 0;
	
	public Graphique()
	{
		this.setTitle("Calculatrice");
		
		JPanel jp_Data = new JPanel(new GridLayout(3, 3, 10, 10));
		jp_Data.add(new JLabel("Chiffre 1 : "));
		jp_Data.add(chiffre1 = new JTextField());
		jp_Data.add(new JLabel("Chiffre 2 : "));
		jp_Data.add(chiffre2 = new JTextField());
		jp_Data.add(new JLabel("Resultat : "));
		jp_Data.add(resultat = new JTextField());
		this.add(jp_Data);
		
		JPanel jp_Boutons = new JPanel(new GridLayout(1, 5, 10, 10));
		jp_Boutons.add(Addition= new JButton("+"));
		jp_Boutons.add(Soustraction= new JButton("-"));
		jp_Boutons.add(Division= new JButton("/"));
		jp_Boutons.add(Multiplication= new JButton("*"));
		this.add(jp_Boutons, BorderLayout.SOUTH);
		
		Addition.addActionListener(this);
		Soustraction.addActionListener(this);
		Division.addActionListener(this);
		Multiplication.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		if (arg0.getSource() == Addition)
		{
			i = Float.parseFloat(chiffre1.getText());
			e = Float.parseFloat(chiffre2.getText());
			resultat.setText(String.valueOf(e + i));
		}
		if (arg0.getSource() == Soustraction)
		{
			i = Float.parseFloat(chiffre1.getText());
			e = Float.parseFloat(chiffre2.getText());
			resultat.setText(String.valueOf(e - i));
		}
		if (arg0.getSource() == Division)
		{
			i = Float.parseFloat(chiffre1.getText());
			e = Float.parseFloat(chiffre2.getText());
			resultat.setText(String.valueOf(e / i));
		}
		if (arg0.getSource() == Multiplication)
		{
			i = Float.parseFloat(chiffre1.getText());
			e = Float.parseFloat(chiffre2.getText());
			resultat.setText(String.valueOf(e * i));
		}
	}
}
