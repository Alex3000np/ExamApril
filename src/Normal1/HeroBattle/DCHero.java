package Normal1.HeroBattle;

public class DCHero extends Hero {
    //fields same as Hero
    //construct
    public DCHero(String name) {                        //motivation 45 if the name is provided only
        super(45, name);
    }

    public DCHero(Integer motivation, String name) {    //creates a DCHero with both name and motivation
        super(motivation, name);
    }

    //methods
    @Override
    public void punch(Hero opponent) {
        if (opponent instanceof DCHero) {
            return;
        } else {
            super.punch(opponent);
        }
    }
}
