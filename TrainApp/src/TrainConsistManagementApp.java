import java.util.*;

class PassengerBogie {
    String id;
    String type;
    int capacity;

    public PassengerBogie(String id, String type, int capacity) {
        this.id = id;
        this.type = type;
        this.capacity = capacity;
    }

    public String toString() {
        return "ID: " + id + ", Type: " + type + ", Capacity: " + capacity;
    }
}

class Train {
    private ArrayList<PassengerBogie> bogies = new ArrayList<>();

    public void addBogie(PassengerBogie b) {
        bogies.add(b);
        System.out.println("Bogie added: " + b.id);
    }

    public void removeBogie(String id) {
        boolean removed = bogies.removeIf(b -> b.id.equals(id));
        if (removed) {
            System.out.println("Bogie removed: " + id);
        } else {
            System.out.println("Bogie not found: " + id);
        }
    }

    public void searchBogie(String id) {
        for (PassengerBogie b : bogies) {
            if (b.id.equals(id)) {
                System.out.println("Bogie found: " + b);
                return;
            }
        }
        System.out.println("Bogie not found: " + id);
    }

    public void displayBogies() {
        System.out.println("\nPassenger Bogies in Train:");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        Train train = new Train();

        train.addBogie(new PassengerBogie("P1", "Sleeper", 72));
        train.addBogie(new PassengerBogie("P2", "AC Chair", 60));
        train.addBogie(new PassengerBogie("P3", "First Class", 40));

        train.displayBogies();

        train.searchBogie("P2");

        train.removeBogie("P2");

        train.displayBogies();
    }
}