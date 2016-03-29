package banque;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Observable;


public class Banque extends Observable {
	private String nomBanque = "Machin Banque";
	private ArrayList<Compte> comptes;
	private ArrayList<Client> clients;
	
	public Banque(){
		comptes = new ArrayList<Compte>();
		clients = new ArrayList<Client>();
		
		/*clients.add(new Client("Boilevin", "Julien", 1));
		comptes.add(new Compte(clients.get(0)));*/
		
	}

	public void nouveauClient(String nom, String prenom){
		Client nouveauClient = new Client(nom, prenom, clients.size()+1);
		clients.add(nouveauClient);
		nouveauCompte(nouveauClient);
	}
	public void nouveauCompte(Client nouveauClient){
		comptes.add(new Compte(nouveauClient));
		setChanged();
		notifyObservers();
	}
	
	
	/**
	 * @return the nomBanque
	 */
	public String getNomBanque() {
		return nomBanque;
	}
	/**
	 * @param nomBanque the nomBanque to set
	 */
	public void setNomBanque(String nomBanque) {
		this.nomBanque = nomBanque;
	}
	/**
	 * @return the comptes
	 */
	public ArrayList<Compte> getComptes() {
		return comptes;
	}
	/**
	 * @param comptes the comptes to set
	 */
	public void setComptes(ArrayList<Compte> comptes) {
		this.comptes = comptes;
	}
	/**
	 * @return the clients
	 */
	public ArrayList<Client> getClients() {
		return clients;
	}
	/**
	 * @param clients the clients to set
	 */
	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}
}
