package Trial2.AnimalProtection;

public class Cat extends Animal {

    //fields
    //constructor
    public Cat(String ownerName, boolean isHealthy, String name) {
        super(ownerName, isHealthy, name);
        this.healCost = (int) (Math.random() * 7);
    }
    //methods
}
