package RetakeLukas.VideoLibrary;

public class Colored extends Video {

    public Colored(String title, String director, int releaseYear) {
        super(title, director, releaseYear, 6.99);
    }

    @Override
    public Video copy() throws Exception {
        return new Colored(this.title, this.director, this.releaseYear);
    }
}
