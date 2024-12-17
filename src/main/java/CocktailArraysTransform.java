public class CocktailArraysTransform {

    public static int[][] transformCocktailIng(String[][] cocktailIng) {
        // Δημιουργία πίνακα για αποθήκευση των αριθμητικών δεδομένων
        int[][] transform = new int[cocktailIng.length][3];

        for (int i = 0; i < cocktailIng.length; i++) {
            // Μετατροπή αλκοολικήςβάσης
            transform[i][0] = switch (cocktailIng[i][0]) {
                case "Whiskey" -> 1;
                case "Gin" -> 2;
                case "Vodka" -> 3;
                case "Rum" -> 4;
                case "Tequila" -> 5;
                default -> 0; 
            };

            // Μετατροπή έντασης
            transform[i][1] = switch (cocktailIng[i][1]) {
                case "Light" -> 1;
                case "Medium" -> 2;
                case "Strong" -> 3;
                default -> 0; 
            };

            // Μετατροπή γεύσης
            transform[i][2] = switch (cocktailIng[i][2]) {
                case "Sweet" -> 1;
                case "Bitter" -> 2;
                case "Sour" -> 3;
                default -> 0; 
            };
        }

        return transform;
    }
}
