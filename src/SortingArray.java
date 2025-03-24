import java.util.ArrayList;
import java.util.Collections;
public class SortingArray {
    public static void main(String[] args) {
        ArrayList<String> Descending = new ArrayList<String>();
        Descending.add("Apple");
        Descending.add("Ball");
        Descending.add("Cat");
        Descending.add("Dog");
        Collections.sort(Descending, Collections.reverseOrder());
        for (String i : Descending) {
            System.out.println(i);
        }
    }
}


