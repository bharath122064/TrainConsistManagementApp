import java.util.Arrays;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        String[] bogieIds = {"B101", "B205", "B309", "B410", "B512"};
        String searchKey = "B309";

        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = bogieIds[mid].compareTo(searchKey);

            if (result == 0) {
                found = true;
                break;
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (found) {
            System.out.println("Bogie ID found: " + searchKey);
        } else {
            System.out.println("Bogie ID not found: " + searchKey);
        }

        System.out.println("Program continues...");
    }
}