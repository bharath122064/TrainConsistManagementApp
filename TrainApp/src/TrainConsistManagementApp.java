public class TrainConsistManagementApp {
    public static void main(String[] args) {

        String[] bogieIds = {"B101", "B205", "B309", "B410", "B512"};
        String searchKey = "B309";

        boolean found = false;

        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchKey)) {
                found = true;
                break;
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