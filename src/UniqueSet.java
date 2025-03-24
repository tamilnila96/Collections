import java.util.HashSet;
public class UniqueSet {
    public static void main(String[] args) {
       HashSet<Integer> numbers = new HashSet<Integer>();
       numbers.add(8);
       numbers.add(20);
       numbers.add(17);
       numbers.add(31);
       numbers.clear();
        System.out.println(numbers);
//        for(int i = 1; i<=10; i ++){
//           if(numbers.contains(i)){
//               System.out.println(i +"It was found in set");
//           }
//           else{
//               System.out.println(i + "It was not found");
//           }
        }
    }


