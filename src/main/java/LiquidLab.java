public class LiquidLab {
    public static void main(String[] args) {
        InsertValues iv1 = new InsertValues();
        boolean success = false;
        boolean baseSet = false;   // Για να παρακολουθούμε αν η βάση είναι σωστή
        boolean flavorSet = false; // Για να παρακολουθούμε αν η γεύση είναι σωστή

        while (!success) {
            try {
                iv1.insert(baseSet, flavorSet); // Περνάμε την κατάσταση της βάσης και της γεύσης
                success = true; // Αν όλα είναι σωστά, ολοκληρώνουμε τον βρόχο
            } catch (DrinkBaseException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please enter a valid base.");
                baseSet = false; // Αν η βάση είναι λάθος, ζητάμε ξανά τη βάση
            } catch (FlavourException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please enter a valid flavor.");
                flavorSet = false; // Αν η γεύση είναι λάθος, ζητάμε ξανά τη γεύση
                baseSet = true;   // Η βάση είναι σωστή
            } catch (AlcoholContentException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please enter a valid intensity.");
                flavorSet = true; // Η γεύση είναι σωστή
                baseSet = true;   // Η βάση είναι σωστή
            }
        }
    }
}
