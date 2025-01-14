public class UserChoiceTransform {
    public int transformChoice(String bs, String flvr, String intnst) {
        int baseInt = switch (bs) {
            case "whiskey" -> 1;
            case "gin" -> 2;
            case "vodka" -> 3;
            case "rum" -> 4;
            case "tequila" -> 5;
            default -> 0; // Μη έγκυρη βάση
        };

        int flavorInt = switch (flvr) {
            case "sweet" -> 1;
            case "bitter" -> 2;
            case "sour" -> 3;
            default -> 0; // Μη έγκυρη γεύση
        };

        int intensityInt = switch (intnst) {
            case "light" -> 1;
            case "medium" -> 2;
            case "strong" -> 3;
            default -> 0; // Μη έγκυρη ένταση
        };

        // Συνδυασμός των τιμών σε έναν μοναδικό αριθμό (π.χ., 123 για Whiskey, Sweet, Strong)
        return baseInt * 100 + flavorInt * 10 + intensityInt;
    }
}



