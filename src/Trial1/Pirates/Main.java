package Trial1.Pirates;

public class Main {
    public static void main(String[] args) {
        Pirate p1 = new Pirate("Anton", 50, true);
        Pirate p2 = new Pirate("Michail", 3, true);
        Pirate p3 = new Pirate("Radon", 150, true);
        Pirate p4 = new Pirate("Anton2", 50, true);
        Pirate c1 = new Captain("Jack", 1000, false);

        Ship ship = new Ship();
        System.out.println(ship.addPirate(p1));
        System.out.println(ship.addPirate(p2));
        System.out.println(ship.addPirate(p3));
        System.out.println(ship.addPirate(p4));
        System.out.println(ship.addPirate(c1));
        System.out.println(ship.addPirate(c1));

        System.out.println(ship.getGolds());
        System.out.println(ship.getPoorPirates());
    }
}
