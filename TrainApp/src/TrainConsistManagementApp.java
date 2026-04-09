class PassengerBogie {
    String type;
    int capacity;

    public PassengerBogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println(type + " - Capacity: " + capacity);
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        PassengerBogie[] bogies = {
                new PassengerBogie("Sleeper", 72),
                new PassengerBogie("AC Chair", 50),
                new PassengerBogie("First Class", 30),
                new PassengerBogie("Sleeper", 60)
        };

        System.out.println("Before Sorting:");
        for (PassengerBogie b : bogies) {
            b.display();
        }

        int n = bogies.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (bogies[j].capacity > bogies[j + 1].capacity) {
                    PassengerBogie temp = bogies[j];
                    bogies[j] = bogies[j + 1];
                    bogies[j + 1] = temp;
                }
            }
        }

        System.out.println("\nAfter Sorting:");
        for (PassengerBogie b : bogies) {
            b.display();
        }
    }
}