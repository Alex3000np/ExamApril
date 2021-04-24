package RetakeLukas.VideoLibrary;

public class GrayScale extends Video {

    public GrayScale(String title, String director, int releaseYear) {
        super(title, director, releaseYear, 3.99);

    }

    @Override
    public Video copy() throws Exception {
        throw new Exception("The Police will find you soon");
    }
}
