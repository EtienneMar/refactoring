package refactoring.extract_classes;

public class Agent {
    private String nom;
    private String prenom;
    private String fonction;
    private String adresse;
    private int telephone;

    public Agent(String nom, String prenom, String fonction, String adresse, int telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.fonction = fonction;
        this.adresse = adresse;
        this.telephone = telephone;
    }
    public Agent(){

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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }


    @Override
    public String toString() {
        return "Agent{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", fonction='" + fonction + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telephone=" + telephone +
                '}';
    }
}


