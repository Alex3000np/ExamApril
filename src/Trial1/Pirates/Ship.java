package Trial1.Pirates;

import java.util.ArrayList;

public class Ship {
    //fields
    protected ArrayList<Pirate> piratesList = new ArrayList<>();

    //constructor
//    public Ship(ArrayList<Pirate> piratesList) {                //s/b 2x construct?
//        this.piratesList = piratesList;
//    }

    public Ship() {                                             //s/b 2x construct?
        this.piratesList = new ArrayList<>();
    }


    //methods
    public boolean addPirate(Pirate p) {
        if (p instanceof Captain && this.hasCaptain()) {        //
            System.out.println("ty pidor: 1x captain tolko");
            return false;
        }
        this.piratesList.add(p);
        return true;
    }

    public boolean hasCaptain() {
        for (Pirate p : this.piratesList) {
            if (p instanceof Captain) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Pirate> getPoorPirates() {
        ArrayList<Pirate> porPiratesList = new ArrayList<>();
        for (Pirate p : this.piratesList) {
            if (p.hasWoodenLeg() && p.getGold() < 15) {
                porPiratesList.add(p);
            }
        }
        return porPiratesList;
    }

    public int getGolds() {
        int goldTotal = 0;
        for (Pirate p : this.piratesList) {
            goldTotal += p.getGold();
        }
        return goldTotal;
    }

    public void lastDayOnTheShip() {
        for (Pirate p : this.piratesList) {
            p.party();
        }
    }

    public void prepareForBattle() {
        for (Pirate p : this.piratesList) {
            for (int i = 0; i < 5; i++) {
                p.work();
            }
            this.lastDayOnTheShip();
        }
    }

}
