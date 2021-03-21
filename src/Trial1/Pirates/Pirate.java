package Trial1.Pirates;

public class Pirate {
    //fields
    protected String name;
    protected int gold;
    protected int hp;
    protected boolean woodenLeg;

    //constructors
    public Pirate(String name, int gold, boolean woodenLeg) {  //dont need hp here its 10 by default
        this.name = name;
        this.gold = gold;
        this.hp = 10;
        this.woodenLeg = woodenLeg;
    }

    //methods
    public void work() {
        this.gold += 1;
        this.hp -= 1;
    }

    public void party() {
        this.hp += 1;
    }

    @Override
    public String toString() {
        if (this.woodenLeg = true) {
            return "Hello, I'm " + this.name + " . I have a wooden leg and " + this.gold + " golds.";
        } else return "Hello, I'm " + this.name + ". I still have my real legs and " + this.gold + " golds.";
    }

    public String getName() {
        return name;
    }

    public int getGold() {
        return gold;
    }

    public int getHp() {
        return hp;
    }

    public boolean hasWoodenLeg() {
        return woodenLeg;
    }
}
