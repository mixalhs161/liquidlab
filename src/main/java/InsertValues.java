import java.util.Scanner;

public class InsertValues {

    private Scanner scanner = new Scanner(System.in);

    // Μέθοδος για εισαγωγή τιμών
    public void insert() throws DrinkBaseException, FlavourException, AlcoholContentException {
        System.out.print("Enter base: ");
        String base = scanner.nextLine();
        validateBase(base);

        System.out.print("Enter flavor: ");
        String flavor = scanner.nextLine();
        validateFlavor(flavor);

        System.out.print("Enter intensity: ");
        String intensity = scanner.nextLine();
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
}
