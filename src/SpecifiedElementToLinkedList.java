import java.util.LinkedList;
public class SpecifiedElementToLinkedList {
    public static void main(String[] args) {
        LinkedList<String>cars = new LinkedList<String>();
        cars.add("BMW ");
        cars.add("Ford ");
        cars.add("Kia ");
        cars.add("Creta ");
        cars.addLast("Everything is a motorsport");
        for(String i : cars){
            System.out.println(i);
        }

    }


}
