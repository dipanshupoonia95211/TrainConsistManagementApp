class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Bogie array (try empty {} to test exception)
        String[] bogieIds = {"BG101", "BG205", "BG309"};

        String target = "BG205";

        // Fail-fast validation
        if (bogieIds.length == 0) {
            throw new IllegalStateException("Cannot perform search: No bogies in the train.");
        }

        // Linear Search (can be any search logic)
        boolean found = false;
        for (String id : bogieIds) {
            if (id.equals(target)) {
                found = true;
                break;
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