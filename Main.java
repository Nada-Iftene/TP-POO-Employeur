
public class Main {

	public static void main(String[] args) {
		Employeur em = new Employeur("iftene", "Es-senia");
		EmployeTempsPlein ep = new EmployeTempsPlein("Mohamed", 4000);
		EmpTempsPartiel ep2 = new EmpTempsPartiel("Aissaoui", 2544);
		em.employes.add(ep);
		em.employes.add(ep2);

		ep.posteOccupe = "Agent de securité";
		ep2.posteOccupe = "Femme de menage";

		ep.setNbJours(5);
		ep2.setNumH(12);
		ep.calculPaie();
		ep2.calculPaie();
		ep.affichePaie();
		ep2.affichePaie();

	}

}
