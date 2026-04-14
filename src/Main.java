import java.util.HashSet;
import java.util.Set;

class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Set for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Adding IDs (with duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display unique IDs
        System.out.println("Unique Bogie IDs:");
        System.out.println(bogieIds);
    }
}