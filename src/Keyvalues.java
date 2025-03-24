import java.util.HashMap;
public class Keyvalues {
    public static void main(String[] args) {
        HashMap<String,Integer > people = new HashMap <String, Integer>();
        people.put("Tamilnila" , 28);
        people.put("Vignesh " , 35);
        people.put("Pallavi" , 2);

        for( String i : people.keySet()){
            System.out.println( "Key is : "  + i + "Value : " + people.get(i));
        }
        System.out.println(people.size());

    }
}
