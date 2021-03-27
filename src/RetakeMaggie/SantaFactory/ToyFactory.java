package RetakeMaggie.SantaFactory;

import java.util.Random;

public class ToyFactory {
    //field
    protected int balance;

    //construct
    public ToyFactory() {
        this.balance = 200;
    }

    //method
    public Toy produce(String color, int size) {
        Random random = new Random();
        int ran = random.nextInt(2);
        if (this.balance >= 15) {
            if (ran == 0) {
                this.balance -= 15;
                return new JumpingRope(color, size);
            } else {
                this.balance -= 10;
                return new DottedBall(color, size);
            }
        }
        return null;
    }

    public Toy produce(String color) {
        if (this.balance >= 25) {
            Doll doll = new Doll(color);
            this.balance -= doll.cost;
            return doll;
        }
        return null;
    }
}
