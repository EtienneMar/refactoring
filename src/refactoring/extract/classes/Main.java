package refactoring.extract.classes;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    	Voiture twingo = new Voiture("Renault", "Twingo", "BW-025-AE", 25000 ,"GMF", "097KEZR", LocalDate.of(2025, 02, 02));
    	System.out.println("Quel est le prix Hors Taxe de la twingo ? : "+ twingo.prixHT() + "€");
    	System.out.println("L'assurance de la twingo est elle valide ?  : " + twingo.estAssuranceValide());
    	System.out.println("Dans combien de temps expire l'assurance de la twingo ? : " + twingo.joursAvantExpiration());
    	System.out.println(twingo);
    	
    }
}