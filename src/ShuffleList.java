import java.util.Collections;
import java.util.LinkedList;
public class ShuffleList {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        LinkedList<String> carsObjects = new LinkedList<String>();
        cars.add("BMW ");
        cars.add("Ford ");
        cars.add("Kia ");
        cars.add("Creta");
        carsObjects.add("Tyre ");
        carsObjects.add("Wheels ");
        carsObjects.add("Steering ");
        carsObjects.add("Door");


        Collections.copy(cars, carsObjects);
        System.out.println(carsObjects);
    }
}
//        Collections.shuffle(cars);// it will shuffle each and very time
//Collections.copy(cars);



