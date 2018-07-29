
public abstract class Employe {
	protected String nom;
	protected String posteOccupe;
	protected double salaire;

	public abstract void calculPaie();

	public void affichePaie() {
		System.out.println("L'employé " + nom);
		System.out.println("poste occupé:  " + posteOccupe);
		System.out.println("salaire : " + salaire);

	}

}
