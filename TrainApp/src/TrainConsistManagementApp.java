class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    String shape;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargoType) {
        try {
            if (cargoType.equalsIgnoreCase("petroleum") && shape.equalsIgnoreCase("rectangular")) {
                throw new CargoSafetyException("Unsafe cargo assignment: Petroleum cannot be loaded in rectangular bogie.");
            }

            System.out.println("Cargo assigned successfully!");

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Assignment process completed (logged).");
        }
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        GoodsBogie bogie = new GoodsBogie("rectangular");
        bogie.assignCargo("petroleum");
        System.out.println("System running normally...");
    }
}