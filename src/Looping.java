import java.util.ArrayList;
import java.util.Iterator;
public class Looping {
    public static void main(String[] args) {
        ArrayList<Integer>numbers = new ArrayList<Integer>();
        numbers. add(10);
        numbers. add(15);
        numbers. add(5);
        numbers. add(20);
       Iterator<Integer> itObj  = numbers.iterator();
//       while(itObj.hasNext()){
//           System.out.println(itObj.next()); used for lopping every items
        while(itObj.hasNext()) {
            Integer i = itObj.next();
            if (i > 15) {
                itObj.remove();
            }
        }
            System.out.println(numbers);
        }
    }

