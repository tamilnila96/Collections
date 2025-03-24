
import java.util.Iterator;
import java.util.LinkedList;
public class DescendingOrder {
    public static void main(String[] args) {
        LinkedList<String> alphabets = new LinkedList<String>();
        alphabets.add("a");
        alphabets.add("B");
        alphabets.add("C");
        alphabets.add("D");
        Iterator it = alphabets.descendingIterator();
        while(it.hasNext()){
    System.out.println(it.next());

}
    }
}
