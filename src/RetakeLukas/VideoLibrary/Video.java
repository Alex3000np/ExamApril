package RetakeLukas.VideoLibrary;

public abstract class Video {               //note abstract class
    //fields
    protected String title;
    protected String director;
    protected int releaseYear;
    protected double price;
    protected int borCounter;
    protected boolean isAvailable;

    //construct
    public Video(String title, String director, int releaseYear, double price) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.price = price;
        this.borCounter = 0;
        this.isAvailable = true;
    }

    //method
    @Override
    public String toString() {
        return this.title + " by " + this.director + " from " + this.releaseYear + " - borrowed " + this.borCounter + " times.";
    }

    public abstract Video copy() throws Exception; //copy -> note abstract method
}