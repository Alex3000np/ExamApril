package Trial2.AnimalProtection;

import java.util.ArrayList;

public class Shelter {
    //fields
    protected int budget;
    protected ArrayList<Animal> animalsList;
    protected ArrayList<String> adoptersList;
    //construct

    public Shelter(ArrayList<Animal> animalsList, ArrayList<String> adoptersList) {
        this.animalsList = animalsList;
        this.adoptersList = adoptersList;
        this.budget = 50;
    }

    //methods
    public int rescue(Animal a) {
        animalsList.add(a);
        return animalsList.size();
    }

    public int heal() {
        for (Animal xxx : animalsList) {
            if (!xxx.isHealthy && xxx.healCost <= budget) {
                xxx.isHealthy = true;
                budget -= xxx.healCost;
                return 1;
            }
        }
        return 0;
    }

    public void addAdopter(String potentialOwnerName) {
        adoptersList.add(potentialOwnerName);
    }

    public void findNewOwner() {
        int randAnimalNumber = (int) (Math.random() * (animalsList.size() + 1));
        int randAdopterNumber = (int) (Math.random() * (adoptersList.size() + 1));
        if (animalsList.get(randAnimalNumber).isHealthy) {
            animalsList.remove(randAnimalNumber);
            adoptersList.remove(randAdopterNumber);
        }
    }

    public int earnDonation(int donat) {
        this.budget += donat;
        return this.budget;
    }

    @Override
    public String toString() {
        StringBuilder report = new StringBuilder("Budget: " + this.budget + "$, \nThere are " + animalsList.size() + " and " + adoptersList.size() + " potential adopter(s) \n");
        for (Animal animal : animalsList) {
            if (!animal.isHealthy) {
                report.append(animal.name).append(" is not healthy (healing would cost: ").append(animal.healCost).append(" €) and not adoptable \n");
            } else report.append(animal.name).append(" is healthy and adoptable \n");
        }
        return report.toString();
    }
}
