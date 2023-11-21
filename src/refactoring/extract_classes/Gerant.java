package refactoring.extract_classes;

public class Gerant {

        private String nom;
        private String prenom;
        private int telephone;
        private String email;
        private String siteGeres;
        private String adresseDuSite;

        public Gerant(String nom, String prenom, int telephone, String email, String siteGeres, String adresseDuSite) {
                this.nom = nom;
                this.prenom = prenom;
                this.telephone = telephone;
                this.email = email;
                this.siteGeres = siteGeres;
                this.adresseDuSite = adresseDuSite;
        }

        public Gerant() {
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

        public String getSiteGeres() {
                return siteGeres;
        }

        public void setSiteGeres(String siteGeres) {
                this.siteGeres = siteGeres;
        }

        public String getAdresseDuSite() {
                return adresseDuSite;
        }

        public void setAdresseDuSite(String adresseDuSite) {
                this.adresseDuSite = adresseDuSite;
        }

        @Override
        public String toString() {
                return "Gerant{" +
                        "nom='" + nom + '\'' +
                        ", prenom='" + prenom + '\'' +
                        ", telephone=" + telephone +
                        ", email='" + email + '\'' +
                        ", siteGeres='" + siteGeres + '\'' +
                        ", adresseDuSite='" + adresseDuSite + '\'' +
                        '}';
        }
}

