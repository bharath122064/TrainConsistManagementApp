public class TrainConsistManagementApp {
    public static void main(String[] args) {

        String[] bogieIds = {};

        try {
            searchBogie(bogieIds, "B101");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }

    public static void searchBogie(String[] bogieIds, String key) {

        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("Cannot perform search: No bogies available in the train.");
        }

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(key)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie ID found: " + key);
        } else {
            System.out.println("Bogie ID not found: " + key);
        }
    }
}