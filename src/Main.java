import java.util.LinkedList;

class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // LinkedList for ordered train consist
        LinkedList<String> train = new LinkedList<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        // Insert Pantry at position 2 (index 1)
        train.add(1, "Pantry");

        // Remove first and last bogie
        train.removeFirst();
        train.removeLast();

        // Display final consist
        System.out.println("Final Train Consist:");
        System.out.println(train);
    }
}