package refactoring.extract_classes;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Création d'instances d'Agent
        Agent agent1 = new Agent("Nom1", "Prenom1", "Fonction1", "Adresse1", 123456789, "Leclerc" , "34000", "34 rue Chocolatine" );
        Agent agent2 = new Agent("Nom1", "Prenom1", "Fonction1", "Adresse1", 978456612, "Uniqlo" , "34000", "34 rue Fer" );
        // Affichage des informations des agents
        System.out.println(agent1.toString());
        System.out.println(agent2.toString());


        System.out.println("=========================================================");
        System.out.println("Les sites ");

    }
}
