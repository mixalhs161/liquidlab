public class CocktailArraysTransform {

    public static int[][] transformCoctailIng(String[][] coctailIng) {
        // Δημιουργία πίνακα για αποθήκευση των αριθμητικών δεδομένων
        int[][] transform = new int[coctailIng.length][3];

        for (int i = 0; i < coctailIng.length; i++) {
            // Μετατροπή αλκοολικήςβάσης
            transform[i][0] = switch (coctailIng[i][0]) {
                case "Whiskey" -> 1;
                case "Gin" -> 2;
                case "Vodka" -> 3;
                case "Rum" -> 4;
                case "Tequila" -> 5;
                default -> 0; 
            };

            // Μετατροπή έντασης
            transform[i][1] = switch (coctailIng[i][1]) {
                case "Light" -> 1;
                case "Medium" -> 2;
                case "Strong" -> 3;
                default -> 0; 
            };

            // Μετατροπή γεύσης
            transform[i][2] = switch (coctailIng[i][2]) {
                case "Sweet" -> 1;
                case "Bitter" -> 2;
                case "Sour" -> 3;
                default -> 0; 
            };
        }

        return transform;
    }
}
