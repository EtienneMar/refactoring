package refactoring.extract_classes;

import java.time.LocalDate;
import java.time.Period;

public class Agent {
    private String nom;
    private String prenom;
    private String fonction;
    private String adresseAgent;
    private int telephone;
    private String nomDuSite;
    private String codePostal;
    private String adresseSite;
    private static  final String pays = "FRANCE";
    
	public Agent(String nom, String prenom, String fonction, String adresseAgent, int telephone, String nomDuSite,
			String codePostal, String adresseSite) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
		this.adresseAgent = adresseAgent;
		this.telephone = telephone;
		this.nomDuSite = nomDuSite;
		this.codePostal = codePostal;
		this.adresseSite = adresseSite;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public String getAdresseAgent() {
		return adresseAgent;
	}
	public void setAdresseAgent(String adresseAgent) {
		this.adresseAgent = adresseAgent;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getNomDuSite() {
		return nomDuSite;
	}
	public void setNomDuSite(String nomDuSite) {
		this.nomDuSite = nomDuSite;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getAdresseSite() {
		return adresseSite;
	}
	public void setAdresseSite(String adresseSite) {
		this.adresseSite = adresseSite;
	}
	public static String getPays() {
		return pays;
	}

	public boolean estIdentique(Agent autreAgent) {
	    return this.nom.equals(autreAgent.getNom()) && this.prenom.equals(autreAgent.getPrenom());
	}
	
	public int calculerAge(LocalDate dateDeNaissance) {
	    LocalDate aujourdHui = LocalDate.now();
	    Period periode = Period.between(dateDeNaissance, aujourdHui);
	    return periode.getYears();
	}
	
	public void mettreAJourAdresseSite(String codePostal, String nouvelleAdresse) {
	    this.codePostal = codePostal;
	    this.adresseSite = nouvelleAdresse;
	}

	@Override
	public String toString() {
		return "Agent [nom=" + nom + ", prenom=" + prenom + ", fonction=" + fonction + ", adresseAgent=" + adresseAgent
				+ ", telephone=" + telephone + ", nomDuSite=" + nomDuSite + ", codePostal=" + codePostal
				+ ", adresseSite=" + adresseSite + "]";
	}
	
	

}


