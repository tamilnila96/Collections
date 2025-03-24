import java.util.Iterator;
import java.util.LinkedList;
public class SpecifiedList {
    public static void main(String[] args) {
LinkedList<String> elements = new LinkedList<String>();
elements.add("subjects");
        elements.add("class");
        elements.add("objects");
        elements.add("Datatypes");
        Iterator<String> it = elements.iterator();
        while(it.hasNext()){ // to print remaining values
            System.out.println(it.next()); // we can give only this if we need to print only first itenm
        }

    }
}
