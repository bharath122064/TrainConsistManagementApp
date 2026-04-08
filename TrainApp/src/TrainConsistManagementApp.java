import java.util.*;

abstract class Bogie {
    String id;

    public Bogie(String id) {
        this.id = id;
    }

    abstract void display();
}

class PassengerBogie extends Bogie {
    String type;
    int capacity;

    public PassengerBogie(String id, String type, int capacity) {
        super(id);
        this.type = type;
        this.capacity = capacity;
    }

    void display() {
        System.out.println("Passenger Bogie -> ID: " + id + ", Type: " + type + ", Capacity: " + capacity);
    }
}

class GoodsBogie extends Bogie {
    String shape;
    String cargo;

    public GoodsBogie(String id, String shape, String cargo) {
        super(id);
        this.shape = shape;
        this.cargo = cargo;
    }

    void display() {
        System.out.println("Goods Bogie -> ID: " + id + ", Shape: " + shape + ", Cargo: " + cargo);
    }
}

class Train {
    List<Bogie> bogies = new ArrayList<>();

    public void addBogie(Bogie b) {
        bogies.add(b);
    }

    public void showTrain() {
        System.out.println("\nTrain Consist:");
        for (Bogie b : bogies) {
            b.display();
        }
    }

    public void totalCapacity() {
        int total = 0;
        for (Bogie b : bogies) {
            if (b instanceof PassengerBogie) {
                total += ((PassengerBogie) b).capacity;
            }
        }
        System.out.println("\nTotal Passenger Capacity: " + total);
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        Train train = new Train();

        train.addBogie(new PassengerBogie("P1", "Sleeper", 72));
        train.addBogie(new PassengerBogie("P2", "AC Chair", 60));
        train.addBogie(new PassengerBogie("P3", "First Class", 40));

        train.addBogie(new GoodsBogie("G1", "Rectangular", "Coal"));
        train.addBogie(new GoodsBogie("G2", "Cylindrical", "Oil"));

        train.showTrain();
        train.totalCapacity();
    }
}