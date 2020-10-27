package selezioneAuto;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

public class MenuScelta extends JPanel {
	
	JButton marca;
	JButton marca1;
	JButton marca2;
	List<String> tipiAuto;
	MacchinaFactory f;
	JTextArea j;
	JLabel text;
	
	public MenuScelta() {
		this.setLayout(new FlowLayout());
		text = new JLabel("SCEGLI LA MARCA CHE PREFERISCI");
		text.setFont(new Font(Font.SERIF, Font.BOLD, 30));
		marca = new JButton("Opel");
		marca1 = new JButton("Nissan");
		marca2 = new JButton("Renault");
		j = new JTextArea();
		f = new FactoryConcreteMacchina();
		tipiAuto = Arrays.asList("Monovolume", "Sportiva", "Familiare");
		buttonListener(this);
		
		this.add(text); this.add(marca); this.add(marca1); this.add(marca2); this.add(j);
	}
	
	private void buttonListener(JPanel p2) {
		marca.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				j.setText("");
				Marca Opel = f.createOpel();
				String t = (String) JOptionPane.showInputDialog(null, "Quale vuoi scegliere?", "Scegli tipo macchina", JOptionPane.INFORMATION_MESSAGE, null, tipiAuto.toArray(), "Monovolume");
				
				if( t != null)
				j.append(Opel.stampaSpecifiche(t));
			}
		});
		
		marca1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				j.setText("");
				Marca Nissan = f.createNissan();
				String t = (String) JOptionPane.showInputDialog(null, "Quale vuoi scegliere?", "Scegli tipo macchina", JOptionPane.INFORMATION_MESSAGE, null, tipiAuto.toArray(), "Monovolume");
				
				if( t != null)
				j.append(Nissan.stampaSpecifiche(t));
				
			}
		});
		
		marca2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				j.setText("");
				Marca Renault = f.createRenault();
				String t = (String) JOptionPane.showInputDialog(null, "Quale vuoi scegliere?", "Scegli tipo macchina", JOptionPane.INFORMATION_MESSAGE, null, tipiAuto.toArray(), "Monovolume");
				
				if( t != null)
				j.append(Renault.stampaSpecifiche(t));
				
			}
		});
	}
	
}
