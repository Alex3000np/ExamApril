package Normal1.HeroBattle;

import java.util.ArrayList;
import java.util.List;

public class Battle {
    //field
    protected ArrayList<Hero> heroes;

    //constructor
    public Battle(ArrayList<Hero> heroes) {  //able to create a battle by receiving a list of `Hero`s.
        this.heroes = heroes;
    }

    //methods
    public ArrayList<Hero> avengersAssemble() {
        ArrayList<Hero> avengers = new ArrayList<>();
        for (Hero heroX : this.heroes) {
            if (heroX instanceof MarvelHero && heroX.getMotivationLevel() == 2) {
                avengers.add(heroX);
            }
        }
        return avengers;
    }

    public void startBattle() {
        ArrayList<Hero> attackers;
        attackers = avengersAssemble();
        for (Hero heroA : attackers) {              //iterates through all MARVEL heroes
            for (Hero heroH : heroes) {             //iterates through ALL heroes
                heroA.punch(heroH);
                heroH.punch(heroA);
            }
        }
        double marvelMoteTotal = 0.0;
        double dcMoteTotal = 0.0;

        for (Hero heroX : heroes) {
            if (heroX instanceof MarvelHero) {
                marvelMoteTotal += heroX.motivation;
            } else {
                dcMoteTotal += heroX.motivation;
            }
        }
        if (marvelMoteTotal >= dcMoteTotal) {
            for (Hero heroX : heroes) {
                if (heroX instanceof MarvelHero) {
                    System.out.println(heroX.toString());
                }
            }
        } else {
            for (Hero heroX : heroes) {
                if (heroX instanceof DCHero) {
                    System.out.println(heroX.toString());
                }
            }
        }

    }
}
