import java.util.ArrayList;

public class Employeur {
	private static int cptIm;
	private String nom;
	private String adresse;
	private int numIm;
	ArrayList<Employe> employes;

	public Employeur(String nom, String adresse) {
		this.nom = nom;
		cptIm++;
		this.numIm = cptIm;
		this.adresse = adresse;
		employes = new ArrayList<Employe>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getNumIm() {
		return numIm;
	}

	public void setNumIm(int numIm) {
		this.numIm = numIm;
	}

	public ArrayList<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(ArrayList<Employe> employes) {
		this.employes = employes;
	}

}
