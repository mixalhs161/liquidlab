import java.util.Scanner;

public class InsertValues {

    private Scanner scanner = new Scanner(System.in);
    private String base;     // Για αποθήκευση της βάσης
    private String flavor;   // Για αποθήκευση της γεύσης
    private String intensity; // Για αποθήκευση της έντασης

    // Μέθοδος για εισαγωγή τιμών
    public void insert(boolean baseSet, boolean flavorSet) throws DrinkBaseException, FlavourException, AlcoholContentException {
        if (!baseSet) { // Ζητάει τη βάση μόνο αν δεν έχει ήδη οριστεί σωστή
            System.out.print("Enter base: ");
            base = scanner.nextLine();
            validateBase(base);
        }

        if (!flavorSet) { // Ζητάει τη γεύση μόνο αν δεν έχει ήδη οριστεί σωστή
            System.out.print("Enter flavor: ");
            flavor = scanner.nextLine();
            validateFlavor(flavor);
        }

        System.out.print("Enter intensity: ");
        intensity = scanner.nextLine();
        validateIntensity(intensity);

        // Δημιουργία αντικειμένου Cocktail
        Cocktail cock = new Cocktail(base, flavor, intensity);
        System.out.println("Cocktail created: " + cock);
    }

    // Μέθοδος για έλεγχο της βάσης
    private void validateBase(String base) throws DrinkBaseException {
        if (!base.equals("whiskey") && !base.equals("gin") && !base.equals("tequila") &&
            !base.equals("rum") && !base.equals("vodka")) {
            throw new DrinkBaseException("Invalid base: " + base);
        }
    }

    // Μέθοδος για έλεγχο της γεύσης
    private void validateFlavor(String flavor) throws FlavourException {
        if (!flavor.equals("sweet") && !flavor.equals("sour") && !flavor.equals("bitter")) {
            throw new FlavourException("Invalid flavor: " + flavor);
        }
    }

    // Μέθοδος για έλεγχο της έντασης
    private void validateIntensity(String intensity) throws AlcoholContentException {
        if (!intensity.equals("light") && !intensity.equals("medium") && !intensity.equals("strong")) {
            throw new AlcoholContentException("Invalid intensity: " + intensity);
        }
    }
    public int getValues() {
        UserChoiceTransform uct =  new UserChoiceTransform();
        int k = uct.transformChoice(base, flavor, intensity);
        return k;

    }

}
