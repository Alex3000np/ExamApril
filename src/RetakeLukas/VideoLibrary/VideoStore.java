package RetakeLukas.VideoLibrary;

import java.util.ArrayList;

public class VideoStore {
    //field
    ArrayList<Guest> registeredGuests;
    ArrayList<Video> videosList;
    //constructor

    public VideoStore(ArrayList<Guest> registeredGuests, ArrayList<Video> videosList) {
        this.registeredGuests = registeredGuests;
        this.videosList = videosList;
    }

    public VideoStore() {
        this.registeredGuests = new ArrayList<>();
        this.videosList = new ArrayList<>();
    }

    //method
    public void addGuest(Guest guest) {
        this.registeredGuests.add(guest);
    }

    public void addVideo(Video video) {
        this.videosList.add(video);
    }

    public void borrow(Guest guest, Video video) throws Exception {
        if (guest.video != null || !video.isAvailable) {
            throw new Exception("ty pidor");
        } else {
            guest.borrow(video);
            video.isAvailable = false;
        }
    }

    public void returnVideo(Guest guest) {

        if (guest.video != null) {
            guest.video.borCounter++;
            guest.video.isAvailable = true;
            guest.video = null;
        }
    }

    public Video getMostOftenBorrowed(ArrayList<Video> videos) {
        int maxCounter = 0;
        Video maxVideo = null;
        for (Video v : videos) {
            if (v.borCounter > maxCounter) {
                maxCounter = v.borCounter;
                maxVideo = v;
            }
        }
        return maxVideo;
    }
    @Override
    public String toString(){
        return "The store has "+this.videosList.size()+" videos available right now and "+registeredGuests.size()+" guests registered.";
    }

}
