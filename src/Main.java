class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Search key
        String target = "BG309";

        // Linear Search
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(target)) {
                found = true;
                break; // early termination
            }
        }

        // Result
        if (found) {
            System.out.println("Bogie ID " + target + " found.");
        } else {
            System.out.println("Bogie ID " + target + " not found.");
        }
    }
}