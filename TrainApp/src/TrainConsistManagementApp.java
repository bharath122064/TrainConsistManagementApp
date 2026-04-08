import java.util.*;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        LinkedHashSet<String> train = new LinkedHashSet<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        train.add("Sleeper");

        System.out.println("Final Train Formation:");
        for (String bogie : train) {
            System.out.println(bogie);
        }
    }
}