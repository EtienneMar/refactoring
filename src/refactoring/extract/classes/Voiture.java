package refactoring.extract.classes;

import java.time.LocalDate;
import java.time.Period;

public class Voiture {

	private String marque;
	private String modele;
	private String numeroImmatriculation;
	private float prixTTC; 
	private ContratAssuranceVoiture contratAssurance = new ContratAssuranceVoiture();

	

	// Constructeur

	public Voiture(String marque, String modele, String numeroImmatriculation, float prixTTC, String compagnieAssurance,
			String numeroAssurance, LocalDate dateExpiration) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.numeroImmatriculation = numeroImmatriculation;
		this.prixTTC = prixTTC;
		this.contratAssurance.setCompagnieAssurance(compagnieAssurance);
		this.contratAssurance.setNumeroAssurance(numeroAssurance);
		this.contratAssurance.setDateExpiration(dateExpiration);
	}


	//Méthode liées à la voiture

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}


	public String getModele() {
		return modele;
	}


	public void setModele(String modele) {
		this.modele = modele;
	}


	public String getNumeroImmatriculation() {
		return numeroImmatriculation;
	}
	
	public float getPrixTTC() {
		return prixTTC;
	}
	
	public void setPrixTTC(float prixTTC) {
		this.prixTTC = prixTTC;
	}

	public float prixHT() {
		return (float) (prixTTC * 0.80);
	}

	//Méthode de l'assurance
	public void setNumeroImmatriculation(String numeroImmatriculation) {
		this.numeroImmatriculation = numeroImmatriculation;
	}


	public String getCompagnieAssurance() {
		return contratAssurance.getCompagnieAssurance();
	}


	public void setCompagnieAssurance(String compagnieAssurance) {
		this.contratAssurance.setCompagnieAssurance(compagnieAssurance);
	}


	public String getNumeroAssurance() {
		return contratAssurance.getNumeroAssurance();
	}


	public void setNumeroAssurance(String numeroAssurance) {
		this.contratAssurance.setNumeroAssurance(numeroAssurance);
	}


	public LocalDate getDateExpiration() {
		return contratAssurance.getDateExpiration();
	}


	public void setDateExpiration(LocalDate nouvelleDateExpiration) {
		if(nouvelleDateExpiration.isAfter(contratAssurance.getDateExpiration()))
			this.contratAssurance.setDateExpiration(nouvelleDateExpiration);
	}

	public boolean estAssuranceValide() {
		LocalDate aujourdHui = LocalDate.now(); 
		return contratAssurance.getDateExpiration() != null && aujourdHui.isBefore(contratAssurance.getDateExpiration());
	}

    public String joursAvantExpiration() {
        LocalDate aujourdHui = LocalDate.now();
        if (contratAssurance.getDateExpiration() != null && !aujourdHui.isAfter(contratAssurance.getDateExpiration())) {
            Period periode = Period.between(aujourdHui, contratAssurance.getDateExpiration());
            return formatPeriode(periode);
        } else {
            return "L'assurance est déjà expirée ou la date d'expiration n'est pas définie.";
        }
    }

    private String formatPeriode(Period periode) {
        return periode.getYears() + " année(s), " + periode.getMonths() + " mois, et " + periode.getDays() + " jour(s)";
    }

	@Override
	public String toString() {
		return "Voiture : \n[marque=" + marque + ",\n modele=" + modele + ",\n numeroImmatriculation=" + numeroImmatriculation
				+ ",\n prixTTC=" + prixTTC + "€,\n compagnieAssurance=" + contratAssurance.getCompagnieAssurance() + ",\n numeroAssurance="
				+ contratAssurance.getNumeroAssurance() + ",\n dateExpiration=" + contratAssurance.getDateExpiration() + "]";
	}

}