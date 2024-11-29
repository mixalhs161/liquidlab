import java.util.LinkedList;

public class CoctailRecommender {
    private final static int EXPC2 = 3;
     static LinkedList <Integer> Indexes = new LinkedList<Integer>(); // Creation of a list in order to store the indexes of the cocktails which satisfy the user's choice
        public static void IndexOfCocktail1(final int c1,  final int array[][]) {

                for (int row = 0; row < array.length; row++) {
                  if (c1 == array[row][0]) {
                    Indexes.add(row); //Insert the indexes of the cocktails which satisfy the first user's choice

                  }
               }


        }
        public static LinkedList<Integer> getIndexes() {
            return Indexes; // Return the list which contains the indexes of cocktails that satisfy the  user's choice

        }


        /**
         * @param c2
         * @return
         */
        public static void IndexOfCocktails2(final int c2,LinkedList<Integer> IndexOfCocktail1, final int array[][]) {
            int k = 1;
            int i = 0;
            while (k < EXPC2) {

                if (array[Indexes.get(i)][1] == c2) {
                    k += 1;
                } else {
                    Indexes.remove(Indexes.get(i));
                }
                i +=1;

            }
        }

        public static int Finalindex(final int c3,LinkedList<Integer> IndexOfCocktails2) {

        }
}