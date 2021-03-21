package Trial1.Pirates;

public class Captain extends Pirate {
    //fields
    //construct
    public Captain(String name, int gold, boolean woodenLeg) { //hp is default 10
        super(name, gold, woodenLeg);
    }

    //methods
    @Override
    public void work() {
        this.gold += 10;
        this.hp -= 5;
    }

    @Override
    public void party() {
        this.hp += 10;
    }
    //tostring same as super class

}
