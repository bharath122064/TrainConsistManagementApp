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
    private HashSet<String> bogieIds = new HashSet<>();

    public void addBogie(PassengerBogie b) {
        if (bogieIds.contains(b.id)) {
            System.out.println("Duplicate Bogie ID not allowed: " + b.id);
            return;
        }
        bogies.add(b);
        bogieIds.add(b.id);
        System.out.println("Bogie added: " + b.id);
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

        train.addBogie(new PassengerBogie("BG101", "Sleeper", 72));
        train.addBogie(new PassengerBogie("BG102", "AC Chair", 60));
        train.addBogie(new PassengerBogie("BG101", "First Class", 40));

        train.displayBogies();
    }
}