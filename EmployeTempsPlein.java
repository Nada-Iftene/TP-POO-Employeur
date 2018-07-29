
public class EmployeTempsPlein extends Employe {
	private double montant;
	private double prime;
	private int nbJours;

	public EmployeTempsPlein(String nom, double montant) {
		this.montant = montant;
		this.nom = nom;

	}

	public void calculPaie() {
		salaire = (montant * nbJours) + prime;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public double getPrime() {
		return prime;
	}

	public void setPrime(double prime) {
		this.prime = prime;
	}

	public int getNbJours() {
		return nbJours;
	}

	public void setNbJours(int nbJours) {
		this.nbJours = nbJours;
	}

}
