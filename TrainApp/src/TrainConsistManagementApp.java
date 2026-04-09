import java.util.Arrays;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "Cylindrical", "Rectangular"};

        System.out.println("Before Sorting:");
        for (String name : bogieNames) {
            System.out.println(name);
        }

        Arrays.sort(bogieNames);

        System.out.println("\nAfter Sorting:");
        for (String name : bogieNames) {
            System.out.println(name);
        }
    }
}