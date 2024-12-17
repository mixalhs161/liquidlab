public class UserChoiceTransform {
    public int transformChoice(String bs, String flvr, String intnst) {
        int baseInt = switch (bs) {
            case "Whiskey" -> 1;
            case "Gin" -> 2;
            case "Vodka" -> 3;
            case "Rum" -> 4;
            case "Tequila" -> 5;
            default -> 0; // Μη έγκυρη βάση
        };

        int flavorInt = switch (flvr) {
            case "Sweet" -> 1;
            case "Bitter" -> 2;
            case "Sour" -> 3;
            default -> 0; // Μη έγκυρη γεύση
        };

        int intensityInt = switch (intnst) {
            case "Light" -> 1;
            case "Medium" -> 2;
            case "Strong" -> 3;
            default -> 0; // Μη έγκυρη ένταση
        };

        // Συνδυασμός των τιμών σε έναν μοναδικό αριθμό (π.χ., 123 για Whiskey, Sweet, Strong)
        return baseInt * 100 + flavorInt * 10 + intensityInt;
    }
}

