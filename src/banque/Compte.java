package banque;

public class Compte {
	private int numeroCompte;
	private int solde;
	private Client detenteur;
	public Compte(Client detenteur) {
		this.detenteur = detenteur;
	}
	/**
	 * @return the numeroCompte
	 */
	public int getNumeroCompte() {
		return numeroCompte;
	}
	/**
	 * @param numeroCompte the numeroCompte to set
	 */
	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	/**
	 * @return the solde
	 */
	public int getSolde() {
		return solde;
	}
	/**
	 * @param solde the solde to set
	 */
	public void setSolde(int solde) {
		this.solde = solde;
	}
	/**
	 * @return the detenteur
	 */
	public Client getDetenteur() {
		return detenteur;
	}
	/**
	 * @param detenteur the detenteur to set
	 */
	public void setDetenteur(Client detenteur) {
		this.detenteur = detenteur;
	}

}
