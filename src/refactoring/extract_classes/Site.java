package refactoring.extract_classes;

public class Site {

    private String nom;
    private String ville;
    private String  adresse;
    private static  final String pays = "FRANCE";

    public Site(String nom, String ville, String adresse) {
        this.nom = nom;
        this.ville = ville;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Site{" +
                "nom='" + nom + '\'' +
                ", ville='" + ville + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
