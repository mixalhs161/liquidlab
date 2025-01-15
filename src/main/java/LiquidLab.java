import java.util.LinkedList;

public class LiquidLab {
    public static void main(String[] args) {
        System.out.println("Welcome to our app, we will help you choose the cocktail of your liking.");
        System.out.println("Here is your options:\n\n");
        System.out.println("BASE: whiskey, gin, vodka, rum, tequila");
        System.out.println("FLAVOUR:sweet,bitter,sour");
        System.out.println("INTENSITY:light,medium,strong\n\n");
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
        CocktailArrays ca = new CocktailArrays();

        LinkedList <Integer> Indexes =  CocktailRecommender.Indexofcocktail1(iv1.getValues()/100, CocktailArraysTransform.transformCoctailIng(ca.cocktailIng));
        Indexes = CocktailRecommender.Indexofcocktail2(iv1.getValues()%100/10, Indexes, CocktailArraysTransform.transformCoctailIng(ca.cocktailIng));
        Indexes = CocktailRecommender.finalIndex(iv1.getValues()%10,Indexes,CocktailArraysTransform.transformCoctailIng(ca.cocktailIng));
        String cocktailofchoice = ca.cocktailsNames[Indexes.getFirst()];
        System.out.println("Your cocktail of choice is " + cocktailofchoice);
    }
}
