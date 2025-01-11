import java.util.LinkedList;

public class CocktailRecommender {
    public static final int  EXPC2 = 3; // Σταθερά η οποια χρησιμοποιείται για να μην γινονται περιττες αναζητησεις στην 2η αναζητηση
    // Δημιουργία πρώτης μεθόδου στην οποία δημιουργείται λίστα για να "φυλάει" τους δεικτες των κοκτειλ σύμφωνα με την πρώτη επιλογή του χρήστη
    public static LinkedList<Integer>  Indexofcocktail1(int c1, int array[][]) {
        LinkedList <Integer> Indexes = new LinkedList<>();// Δημιουργία λίστας
        for (int i = 0; i<array.length; i++) {
            if (array[i][0] == c1) {
                Indexes.add(i);
            }
        }
        return Indexes;
    }
    //Δημιουργία μεθοδου στην οποία αφαιρούνται τα στοιχεία που δεν συμβαδίζουν με την δεύτερη επιλογή τοου χρήστη
    public static LinkedList<Integer> Indexofcocktail2(int c2, LinkedList<Integer> Indexes,int array[][]) {
        for (int i=0; i<Indexes.size(); i++) {
            int k = 0;
            if (array[(int)Indexes.get(i)][1] == c2) {
                k +=1;
            } else {
                Indexes.remove(i);
                i--;
            }
            if (k == EXPC2) {
                break;
            }
        }
        return Indexes;
    }
    // Δημιουργία μεθόδου η οποία επιστρεφει το τελικο κοκτειλ
    public static LinkedList<Integer> finalIndex(int c3, LinkedList<Integer> Indexes, int array[][]) {
        for (int i = Indexes.size() - 1; i > 0; i--) {
            int index = Indexes.get(i);
            if (array[index][2] != c3) {
               Indexes.remove(i);
            }
        }
        return Indexes;

    }
}
