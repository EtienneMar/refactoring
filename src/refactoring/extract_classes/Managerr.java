package refactoring.extract_classes;

import java.util.List;

public class Managerr {

    private String nom;
    private String prenom;
    private static final String  fonction = "MANAGER";
    private String adresse;
    private int telephone;
    private String email;
    private String password;
    private String username;
    private List<chefdeposte> les_chefs_de_poste_geres;
    private List<Agent> les_agents_geres;

    public Managerr(String nom, String prenom,
                    String adresse, int telephone,
                    String email, String password,
                    String username, List<chefdeposte> les_chefs_de_poste_geres,
                    List<Agent> les_agents_geres) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.email = email;
        this.password = password;
        this.username = username;
        this.les_chefs_de_poste_geres = les_chefs_de_poste_geres;
        this.les_agents_geres = les_agents_geres;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<chefdeposte> getLes_chefs_de_poste_geres() {
        return les_chefs_de_poste_geres;
    }

    public void setLes_chefs_de_poste_geres(List<chefdeposte> les_chefs_de_poste_geres) {
        this.les_chefs_de_poste_geres = les_chefs_de_poste_geres;
    }

    public List<Agent> getLes_agents_geres() {
        return les_agents_geres;
    }

    public void setLes_agents_geres(List<Agent> les_agents_geres) {
        this.les_agents_geres = les_agents_geres;
    }

    @Override
    public String toString() {
        return "Managerr{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telephone=" + telephone +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", les_chefs_de_poste_geres=" + les_chefs_de_poste_geres +
                ", les_agents_geres=" + les_agents_geres +
                '}';
    }
}
