mport static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;

public class CocktailRecommenderTest {

    @Test
    public void testIndexofcocktail1() {
        int[][] array = new int[45][3];

        // Γέμισμα του πίνακα: Τα πρώτα 9 στοιχεία έχουν c1 = 1
        for (int i = 0; i < 9; i++) {
            array[i][0] = 1;
        }
        // Τα υπόλοιπα στοιχεία δεν έχουν c1 = 1
        for (int i = 9; i < 45; i++) {
            array[i][0] = 2;
        }

        LinkedList<Integer> result = CocktailRecommender.Indexofcocktail1(1, array);

        // Ελέγχουμε αν επιστρέφονται 9 στοιχεία
        assertEquals(9, result.size());
        // Ελέγχουμε ότι τα σωστά indexes περιλαμβάνονται στη λίστα
        for (int i = 0; i < 9; i++) {
            assertTrue(result.contains(i));
        }
    }

    @Test
    public void testIndexofcocktail2() {
        int[][] array = new int[45][3];

        // Γέμισμα του πίνακα: Τα πρώτα 9 στοιχεία έχουν c1 = 1
        for (int i = 0; i < 9; i++) {
            array[i][0] = 1;
            array[i][1] = 2; // c2 = 2 για τα πρώτα 3 στοιχεία
        }
        // Τα υπόλοιπα στοιχεία έχουν c2 = 3 (δεν μας ενδιαφέρει εδώ)
        for (int i = 9; i < 45; i++) {
            array[i][1] = 3;
        }

        LinkedList<Integer> indexes = new LinkedList<>();
        for (int i = 0; i < 9; i++) {
            indexes.add(i);
        }

        LinkedList<Integer> result = CocktailRecommender.Indexofcocktail2(2, indexes, array);

        // Ελέγχουμε αν μένουν 3 στοιχεία στη λίστα
        assertEquals(3, result.size());
        // Ελέγχουμε ότι τα σωστά indexes (0, 1, 2) περιλαμβάνονται στη λίστα
        for (int i = 0; i < 3; i++) {
            assertTrue(result.contains(i));
        }
    }

    @Test
    public void testFinalIndex() {
        int[][] array = new int[45][3];

        // Γέμισμα του πίνακα: Τα πρώτα 9 στοιχεία έχουν c1 = 1, c2 = 2
        for (int i = 0; i < 9; i++) {
            array[i][0] = 1;
            array[i][1] = 2;
            array[i][2] = (i == 0) ? 3 : 4; // Μόνο το πρώτο στοιχείο έχει c3 = 3
        }
        // Τα υπόλοιπα στοιχεία δεν μας ενδιαφέρουν για τη δοκιμή
        for (int i = 9; i < 45; i++) {
            array[i][2] = 5;
        }

        LinkedList<Integer> indexes = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            indexes.add(i); // Προσθέτουμε τα indexes 0, 1, 2 από το προηγούμενο αποτέλεσμα
        }

        LinkedList<Integer> result = CocktailRecommender.finalIndex(3, indexes, array);

        // Ελέγχουμε αν μένει 1 στοιχείο στη λίστα
        assertEquals(1, result.size());
        // Ελέγχουμε ότι το μοναδικό index είναι το 0
        assertTrue(result.contains(0));
    }
}

