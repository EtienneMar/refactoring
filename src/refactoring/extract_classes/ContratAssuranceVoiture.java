package refactoring.extract_classes;

import java.time.LocalDate;

public class ContratAssuranceVoiture {
	private String compagnieAssurance;
	private String numeroAssurance;
	private LocalDate dateExpiration;

	public ContratAssuranceVoiture() {
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

	public void setDateExpiration(LocalDate dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
}