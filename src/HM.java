import java.sql.SQLOutput;
import java.util.HashMap;

public class HM {
    public static void main(String[] args) {
        HashMap<Integer,String> ID  = new HashMap<>();
        ID.put( 1," Alice");
        ID.put( 2, "Bob");
        ID.put( 3, "Charlie");
        ID.put( 4, "David");
        // All Entries
        System.out.println("The ID  and name  of students" + ID);


        if(ID.containsKey(2)){
            System.out.println(ID.containsKey(2));
        }
        else{
            System.out.println(" no exixt" + ID.containsKey(2));
        }

        ID.remove(4,"David");
        System.out.println("The HashMap After Removal " + ID);

    }

}
