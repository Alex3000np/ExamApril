package Trial2.AnimalProtection;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {    //for testing purpose
        Dog sharik = new Dog("sasha", true, "sharik");
        Cat murka = new Cat("olga", true, "murka");
        Cat aidsCat = new Cat("olga", false, "sick cat");
        Parrot kesha = new Parrot("zoja", true, "kesha");
        ArrayList<String> adopters = new ArrayList<>();
        adopters.add("anton");
        adopters.add("fedor");
        ArrayList<Animal> allAnimals = new ArrayList<>();
        allAnimals.add(sharik);
        allAnimals.add(murka);
        allAnimals.add(aidsCat);
        allAnimals.add(kesha);


        Shelter prijut = new Shelter(allAnimals,adopters);

        System.out.println(prijut.toString());
    }
}
