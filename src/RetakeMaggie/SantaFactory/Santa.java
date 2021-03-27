package RetakeMaggie.SantaFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Santa {
    //field
    ArrayList<Toy> toyBag;
    ArrayList<String> children;

    //construct
    //method
    public void addToyToBag(String color, int size) {
        Random random = new Random();
        int ran = random.nextInt(2);
        ToyFactory tf = new ToyFactory();
        if (ran == 0) {
            tf.produce(color, size);
        } else tf.produce(color);
    }

    public void bringToChildren() {
        List<String> luckyKids = children.subList(1, 4);
        while (!toyBag.isEmpty() || !luckyKids.isEmpty()) {
            toyBag.get(0).owner = luckyKids.get(0);
            toyBag.remove(0);
            children.remove(0);
            luckyKids.remove(0);
        }
    }
}
