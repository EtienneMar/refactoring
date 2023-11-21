package refactoring.extract_classes;

import java.util.List;

public class SIteAgentChefdeposte {

    private Site site;
    private Managerr manager;
    private chefdeposte chefdeposte;
    private List<Agent> agents ;

    public SIteAgentChefdeposte(Site site, Managerr manager, chefdeposte chefdeposte, List<Agent> agents) {
        this.site = site;
        this.manager = manager;
        this.chefdeposte = chefdeposte;
        this.agents = agents;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public Managerr getManager() {
        return manager;
    }

    public void setManager(Managerr manager) {
        this.manager = manager;
    }

    public chefdeposte getChefdeposte() {
        return chefdeposte;
    }

    public void setChefdeposte(chefdeposte chefdeposte) {
        this.chefdeposte = chefdeposte;
    }

    public List<Agent> getAgents() {
        return agents;
    }

    public void setAgents(List<Agent> agents) {
        this.agents = agents;
    }

    @Override
    public String toString() {
        return "SIteAgentChefdeposte{" +
                "site=" + site +
                ", manager=" + manager +
                ", chefdeposte=" + chefdeposte +
                ", agents=" + agents +
                '}';
    }
}
