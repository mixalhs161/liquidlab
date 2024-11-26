import java.util.LinkedList;

public class CoctailRecommender {

        public static List<Integer> IndexOfCocktail1(final int c1,  final int array[][]) {
               final LinkedList <Integer> Indexes = new LinkedList<Integer>(); // Creation of a list in order to store the indexes of the cocktails which satisfy the user's choice
               for (int row = 0; row < array.length; row++) {
                if (c1 == array[row][1]) {
                    Indexes.add(row); //Insert the indexes of the cocktails which satisfy the first user's choice

                }
               }
               return Indexes; // Return the list which contains the indexes of cocktails that satisfy the first user's choice

        }


        /**
         * @param c2
         * @return
         */
        public static LinkedList<Integer> IndexOfCocktails2(final int c2,LinkedList<Integer> IndexOfCocktail1) {

        }
        public static int Finalindex(final int c3,LinkedList<Integer> IndexOfCocktails2) {

        }
    }