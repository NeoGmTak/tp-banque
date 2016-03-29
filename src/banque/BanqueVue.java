package banque;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField; 


public class BanqueVue extends JFrame implements Observer{
	private Banque banque;
	private BanqueCtrl ctrlbanque;
	private JButton valider;
	private ArrayList<Compte> comptes;
	private ArrayList<Client> clients;
	/*Container pan = this.getContentPane();*/
	private JPanel pan = new JPanel();
	private JTextField champNom;
	private JTextField champPrenom;
	
	public BanqueVue(Banque banque, BanqueCtrl ctrlbanque) {
		super();
		this.setSize(500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.banque = banque;
		this.banque.addObserver(this);
		this.ctrlbanque = ctrlbanque;
		
	    
		champNom = new JTextField("Nom");
		champNom.setPreferredSize(new Dimension(150, 30));
		champPrenom = new JTextField("Prénom");
		champPrenom.setPreferredSize(new Dimension(150, 30));
		valider = new JButton("Valider");
	
		
		pan.add(champPrenom);
		pan.add(champNom);
		pan.add(valider);
		this.setContentPane(pan);
		
		this.setVisible(true);
		
		valider.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
				try {
					ctrlbanque.nouvelleEntree(champNom.getText(), champPrenom.getText());
					System.out.println(banque.getClients().get(banque.getClients().size()-1).getNom());
					System.out.println(banque.getClients().get(banque.getClients().size()-1).getPrenom());
					System.out.println(banque.getClients().get(banque.getClients().size()-1).getNumero());
				} catch (Exception e1) {
					System.err.println("ereur"+e1);
				}
			}
		});
		
		
	}
	@Override
	public void update(Observable arg0, Object arg1) {
		repaint();
		
	}
	
	public void paint(Graphics g) {
		this.setVisible(true);
	}
	

}
