import java.util.Iterator;
import java.util.LinkedList;
public class GetList {
    public static void main(String[] args) {
        LinkedList<String> alphabets = new LinkedList<String>();
        alphabets.add("apple");
        alphabets.add("Banana");
        alphabets.add("Cow");
        alphabets.add("Dog");
        System.out.println(alphabets);
        System.out.println("The first element is " + alphabets.getFirst());
        System.out.println("The first element is " + alphabets.getLast());

        }
    }
