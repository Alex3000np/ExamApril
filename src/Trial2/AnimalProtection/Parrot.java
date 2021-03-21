package Trial2.AnimalProtection;

public class Parrot extends Animal{
    //fields
    //constructor
    public Parrot(String ownerName, boolean isHealthy, String name) {
        super(ownerName, isHealthy, name);
        this.healCost = (int) (Math.random() * (11 - 4 + 1) + 4);
    }
    //methods
}
