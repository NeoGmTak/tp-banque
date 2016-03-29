package banque;


public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Banque banque = new Banque();
			BanqueCtrl ctrlbanque = new BanqueCtrl(banque);
			BanqueVue vuebanque = new BanqueVue(banque, ctrlbanque);
			Client client1 = new Client("BOILEVIN", "Julien", 1);
			Client client2 = new Client("DURAND", "Pierre", 2);
			Client client3 = new Client("BOUVIER", "Jean", 3);
			
			banque.getClients().add(client1);
			banque.getComptes().add(new Compte(client1));
			banque.getComptes().get(0).setSolde(0);
			banque.getClients().add(client2);
			banque.getComptes().add(new Compte(client2));
			banque.getComptes().get(1).setSolde(0);
			banque.getClients().add(client3);
			banque.getComptes().add(new Compte(client3));
			banque.getComptes().get(2).setSolde(0);
			
		} catch (Exception e) {
			System.err.println("ereur"+e);
		}
	}

}
