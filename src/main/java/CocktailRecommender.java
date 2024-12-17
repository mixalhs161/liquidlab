import java.util.LinkedList;

public class CocktailRecommender {
    private final static int EXPC2 = 3; //expected remaining coctails in the second search
    public static LinkedList <Integer> Indexes = new LinkedList<Integer>(); // Creation of a list in order to store the indexes of the cocktails that satisfy the user's choice.
    // Creation of a method that insert's the indexes of the cocktails in the list which statisfy the user's first choice.
    public static void IndexOfCocktail1(final int c1,  final int array[][]) {

                for (int row = 0; row < array.length; row++) {
                  if (c1 == array[row][0]) {
                    Indexes.add(row); //Insert the indexes of the cocktails which satisfy the first user's choice}
                  }
                }


    }
        public CocktailRecommender(LinkedList<Integer> Indexes) {
            CocktailRecommender.Indexes = Indexes;
        }



        // Creation of a method that removes the cocktails which don't follow the user's preference for the second choice.
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
        // Creation of method which removes the cocktail's that dont follow whith the thirth user's choice and finally returns the index of the wanted coktail.
        public static int Finalindex(final int c3,LinkedList<Integer> IndexOfCocktails2, final int array[][]) {
           for (int i=0; i<Indexes.size(); i++) {
                if (array[Indexes.get(i)][c3] != c3) {
                    Indexes.remove(i);
                }
            }
           return Indexes.getFirst();
        }
}