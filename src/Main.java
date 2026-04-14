import java.util.Arrays;

class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie names
        String[] bogies = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        // Sort using built-in method
        Arrays.sort(bogies);

        // Display sorted array
        System.out.println("Sorted Bogie Names:");
        System.out.println(Arrays.toString(bogies));
    }
}