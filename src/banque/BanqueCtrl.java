package banque;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BanqueCtrl {
	private Banque ctrlbanque;
	public BanqueCtrl(Banque ctrlbanque) {
		this.ctrlbanque = ctrlbanque;
	}
	
	
	public void nouvelleEntree (String nom, String prenom){
		ctrlbanque.nouveauClient(nom, prenom);
	}
	

}
