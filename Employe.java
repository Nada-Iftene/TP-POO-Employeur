
public abstract class Employe {
	protected String nom;
	protected String posteOccupe;
	protected double salaire;

	public abstract void calculPaie();

	public void affichePaie() {
		System.out.println("L'employ� " + nom);
		System.out.println("poste occup�:  " + posteOccupe);
		System.out.println("salaire : " + salaire);

	}

}
