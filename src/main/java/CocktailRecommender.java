import java.util.LinkedList;

public class CocktailRecommender {
    public static final int  EXPC2 = 3;
    public static LinkedList<Integer> Indexes Indexofcocktail1(int c1, int array[][]) {
        LinkedList <Integer> Indexes = new LinkedList<>();
        for (int i = 0; i<array.length; i++) {
            if (array[i][0] == c1) {
                Indexes.add(i);
            }
        }
        return Indexes;
    }
    public static LinkedList<Integer> Indexes Indexofcocktail2(int c2, LinkedList Indexes,int array[][]) {
        for (int i=0; i<Indexes.size(); i++) {
            int k = 0;
            if (array[Indexes.get(i)][1] == c2) {
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
    public static int finalIndex(int c3, LinkedList Indexes, int array[][]) {
        for
    }

}