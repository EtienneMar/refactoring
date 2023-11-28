package refactoring.extract.classes;

import java.time.LocalDate;
import java.time.Period;

/**
 * État de la classe après avoir opérée plusieurs opération de move des méthodes en 
 * plus du refactoring
 * 
 * 
 * @author Etienne Martin / Loum Maniang
 *
 */

public class ContratAssuranceVoitureAvecDeplacementMethode {
	public String compagnieAssurance;
	public String numeroAssurance;
	public LocalDate dateExpiration;

	public ContratAssuranceVoitureAvecDeplacementMethode() {
	}
	
	
	
	//Méthode de l'assurance

	public ContratAssuranceVoitureAvecDeplacementMethode(String compagnieAssurance, String numeroAssurance, LocalDate dateExpiration) {
		super();
		this.compagnieAssurance = compagnieAssurance;
		this.numeroAssurance = numeroAssurance;
		this.dateExpiration = dateExpiration;
	}





	public String getCompagnieAssurance() {
		return compagnieAssurance;
	}


	public void setCompagnieAssurance(String compagnieAssurance) {
		this.compagnieAssurance = compagnieAssurance;
	}


	public String getNumeroAssurance() {
		return numeroAssurance;
	}


	public void setNumeroAssurance(String numeroAssurance) {
		this.numeroAssurance = numeroAssurance;
	}


	public LocalDate getDateExpiration() {
		return dateExpiration;
	}


	public void setDateExpiration(LocalDate nouvelleDateExpiration) {
		if(nouvelleDateExpiration.isAfter(dateExpiration))
			dateExpiration = nouvelleDateExpiration;
	}

	public boolean estAssuranceValide() {
		LocalDate aujourdHui = LocalDate.now(); 
		return dateExpiration != null && aujourdHui.isBefore(dateExpiration);
	}

    public String joursAvantExpiration() {
        LocalDate aujourdHui = LocalDate.now();
        if (dateExpiration != null && !aujourdHui.isAfter(dateExpiration)) {
            Period periode = Period.between(aujourdHui, dateExpiration);
            return formatPeriode(periode);
        } else {
            return "L'assurance est déjà expirée ou la date d'expiration n'est pas définie.";
        }
    }

    private String formatPeriode(Period periode) {
        return periode.getYears() + " année(s), " + periode.getMonths() + " mois, et " + periode.getDays() + " jour(s)";
    }

}