
public class EmpTempsPartiel extends Employe {
	private double montantHeur;
	private int numH;

	public EmpTempsPartiel(String nom, double montantHeur) {
		this.nom = nom;
		this.montantHeur = montantHeur;

	}

	public double getMontantHeur() {
		return montantHeur;
	}

	public void setMontantHeur(double montantHeur) {
		this.montantHeur = montantHeur;
	}

	public int getNumH() {
		return numH;
	}

	public void setNumH(int numH) {
		this.numH = numH;
	}

	public void calculPaie() {
		salaire = montantHeur * numH;
	}

}
