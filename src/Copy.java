import java.util.Collections;
import java.util.HashMap;
public class Copy {
    public static void main(String[] args) {
        HashMap<Character,Double> mapping = new HashMap<Character,Double>();
        HashMap<Character,Double> mapping1 = new HashMap<Character,Double>();

        mapping.put('A',03.22 );
        mapping.put('B',06.66 );
        mapping.put('C',05.55 );
        mapping1.put('D',08.02 );
        mapping1.put('E',05.55 );
        mapping1.put('F',09.99 );
    mapping1.putAll(mapping);
        System.out.println(mapping1);


    }
}
