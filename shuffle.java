import java.util.ArrayList;
import java.util.Collections;
public class ShuffleArray {
    public static void main(String[] args) {
        // Create an ArrayList with the values (1, 2, 3, 4, 5, 6, 7)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        // Shuffle the ArrayList
        Collections.shuffle(list);

        // Convert the shuffled ArrayList back to an array
        Integer[] shuffledArray = list.toArray(new Integer[0]);
        // Print the shuffled array
        for (int num : shuffledArray) {
            System.out.print(num + " ");
        }
    }
}