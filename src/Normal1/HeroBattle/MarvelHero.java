package Normal1.HeroBattle;

public class MarvelHero extends Hero {
    //fields same as Hero
    //construct
    public MarvelHero(Integer motivation, String name) {
        super(motivation, name);
    }

    public MarvelHero(String name) {
        super(45, name);
    }

    @Override
    public void punch(Hero opponent) {
        if (opponent instanceof MarvelHero) {
            return;
        } else {
            super.punch(opponent);
        }
    }
}
