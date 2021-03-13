package Normal1.HeroBattle;

import java.util.ArrayList;

//main is not needed class, just a check
public class Main {
    public static void main(String[] args) {
        DCHero x = new DCHero("bob");
        MarvelHero y = new MarvelHero("pidor");
        ArrayList<Hero> arr = new ArrayList<>();
        arr.add(x);
        arr.add(y);
        Battle b = new Battle(arr);
        b.avengersAssemble();
        b.startBattle();
    }
}
