import java.util.Arrays;

class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Unsorted array of bogie IDs
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Sort before binary search (precondition)
        Arrays.sort(bogieIds);

        // Search key
        String target = "BG309";

        // Binary Search
        int low = 0, high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int cmp = bogieIds[mid].compareTo(target);

            if (cmp == 0) {
                found = true;
                break;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
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