package RetakeLukas.VideoLibrary;

public class Guest {
    //field
    protected String name;
    protected String address;
    protected Video video;

    //construct
    public Guest(String name, String address) {
        this.name = name;
        this.address = address;
        this.video = null;
    }

    //method
    public boolean borrow(Video video) {
        if (this.video == null) {
            this.video = video;
            return true;
        }
        return false;
    }

    public Video steal() throws Exception {
        if (this.video == null) {
            System.out.println("net video a ty pidor");
            return null;
        } else return this.video.copy();
    }

    @Override
    public String toString() {
        if (this.video == null) {
            return this.name + " is not borrowing anything currently.";
        } else
            return this.name + " is currently borrowing " + this.video.title;
    }
}
