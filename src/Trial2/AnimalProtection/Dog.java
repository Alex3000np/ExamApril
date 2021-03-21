package Trial2.AnimalProtection;

public class Dog extends Animal{
    //fields
    //constructor
    public Dog(String ownerName, boolean isHealthy, String name) {
        super(ownerName, isHealthy, name);
        this.healCost = (int) (Math.random() * 9);
    }
    //methods
}
