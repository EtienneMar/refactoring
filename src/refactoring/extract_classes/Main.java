package refactoring.extract_classes;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Création d'instances d'Agent
        Agent agent1 = new Agent("Nom1", "Prenom1", "Fonction1", "Adresse1", 123456789);
        Agent agent2 = new Agent("Nom2", "Prenom2", "Fonction2", "Adresse2", 987654321);

        // Affichage des informations des agents
        System.out.println(agent1.toString());
        System.out.println(agent2.toString());

        System.out.println("=========================================================");
        System.out.println("Les chefs de postes ");

        // Création d'instances de chefdeposte
        chefdeposte chef1 = new chefdeposte("ChefNom1", "ChefPrenom1", "ChefAdresse1", 111222333, "chef1@email.com", "password1", "username1");
        chefdeposte chef2 = new chefdeposte("ChefNom2", "ChefPrenom2", "ChefAdresse2", 444555666, "chef2@email.com", "password2", "username2");

        // Affichage des informations des chefs de poste
        System.out.println(chef1.toString());
        System.out.println(chef2.toString());

        System.out.println("=========================================================");
        System.out.println("Les gérants ");

        // Création d'instances de Gerant
        Gerant gerant1 = new Gerant("GerantNom1", "GerantPrenom1", 777888999, "gerant1@email.com", "Site1", "AdresseSite1");
        Gerant gerant2 = new Gerant("GerantNom2", "GerantPrenom2", 111222333, "gerant2@email.com", "Site2", "AdresseSite2");

        // Affichage des informations des gérants
        System.out.println(gerant1.toString());
        System.out.println(gerant2.toString());

        System.out.println("=========================================================");
        System.out.println("Les managers ");

        // Création d'instances de Managerr
        List<chefdeposte> chefsGeres = new ArrayList<>();
        chefsGeres.add(chef1);
        chefsGeres.add(chef2);

        List<Agent> agentsGeres = new ArrayList<>();
        agentsGeres.add(agent1);
        agentsGeres.add(agent2);

        Managerr manager1 = new Managerr("ManagerNom1", "ManagerPrenom1", "ManagerAdresse1", 999888777, "manager1@email.com", "passwordManager1", "usernameManager1", chefsGeres, agentsGeres);

        // Affichage des informations des managers
        System.out.println(manager1.toString());

        System.out.println("=========================================================");
        System.out.println("Les sites ");

        // Création d'instances de Site
        Site site1 = new Site("Site1", "Ville1", "AdresseSite1");
        Site site2 = new Site("Site2", "Ville2", "AdresseSite2");

        // Affichage des informations des sites
        System.out.println(site1.toString());
        System.out.println(site2.toString());

        System.out.println("=========================================================");
        System.out.println("Les sites avec leurs chefs de poste, managers et agents ");

        // Création d'instances de SIteAgentChefdeposte
        SIteAgentChefdeposte siteAgentChef1 = new SIteAgentChefdeposte(site1, manager1, chef1, agentsGeres);

        // Affichage des informations des sites avec leurs chefs de poste, managers et agents
        System.out.println(siteAgentChef1.toString());
    }
}
