public class LiquidLab {
    public static void liquidLab(String[] args) {
        InsertValues iv1 = new InsertValues();
        boolean success = false;

        while (!success) {
            try {
                iv1.insert();
                success = true; // Αν δεν πεταχτεί εξαίρεση, ολοκλήρωσε τον βρόχο
            } catch (DrinkBaseException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please enter a valid base.");
            } catch (FlavourException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please enter a valid flavor.");
            } catch (AlcoholContentException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please enter a valid intensity.");
            }
        }
    }
}
