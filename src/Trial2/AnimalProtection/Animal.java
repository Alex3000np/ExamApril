package Trial2.AnimalProtection;

public class Animal {
    //fields
    protected String ownerName;
    protected boolean isHealthy;
    protected int healCost;
    protected String name;

    //constructor

    public Animal(String ownerName, boolean isHealthy, int healCost, String name) {
        this.ownerName = ownerName;
        this.isHealthy = isHealthy;
        this.healCost = healCost;
        this.name = name;
    }

    public Animal(String ownerName, boolean isHealthy, String name) {
        this.ownerName = ownerName;
        this.isHealthy = isHealthy;
//        this.healCost = healCost;         //will be used at Cat, no need to have this line
        this.name = name;
    }

    public Animal(String ownerName, boolean isHealthy, int healCost) {
        this.ownerName = ownerName;
        this.isHealthy = isHealthy;
        this.healCost = healCost;
        this.name = "Animal";               //The animal's name is the same as the class name by default, but it can be set trough constructor as well
    }

    //methods
    public void heal() {
        this.isHealthy = true;
    }

    public boolean isAdoptable() {
        if (this.isHealthy) {
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        if (!this.isHealthy) {
            return this.name + " is not healthy (" + this.healCost + "€), and not adoptable";
        } else return this.name + " is healthy, and adoptable";
    }

}
