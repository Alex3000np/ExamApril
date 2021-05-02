package Normal1.HeroBattle;

public class Hero {
    //fields
    protected String name;
    protected int motivation;

    //construct
    public Hero(Integer motivation, String name) {
        this.motivation = motivation;
        this.name = name;
    }

    //methods
    public Integer getMotivationLevel() {
        if (motivation <= 25) {
            return 0;
        } else if (motivation > 25 && motivation < 40) {
            return 1;
        } else return 2;
    }

    public void punch(Hero opponent) {
        if (this.getMotivationLevel() >= 1) {
            opponent.bePunched((int) Math.ceil(this.motivation / 1.5));
        }
    }

    public void bePunched(double damage) {
        this.motivation -= (int) Math.ceil((damage * 2) / this.motivation); //rounds up  converts to int
        this.motivation = this.motivation < 0 ? 0 : this.motivation;
    }

    @Override
    public String toString() {
        if (this.getMotivationLevel() == 0) {
            return this.name + "is not motivated anymore.";
        } else if (this.getMotivationLevel() == 1) {
            return this.name + "is motivated.";
        } else return this.name + "is well motivated.";
    }

}
