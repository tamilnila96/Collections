import java.util.ArrayList;
public class IterateAllElements {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(9);
        numbers.add(10);
        numbers.add(3);
        for (Integer i : numbers) {
        System.out.println(i);
        }
    }
}
