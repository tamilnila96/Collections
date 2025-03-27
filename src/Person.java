import java.util.HashSet;
public class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name :" + name +" -- " + " Age : " + age);
    }

}
class personObjects {
    public static void main(String[] args) {
        HashSet<Person> details = new HashSet<>();
        Person person1 = new Person("Nila", 28);
        Person person2 = new Person("Divya", 22);
        Person person3 = new Person("vanmathi", 24);
        details.add(person1);
        details.add(person2);
        details.add(person3);
        System.out.println("Contents on the hashset ");
        for (Person i : details) {
            i.display();
        }

        if(details.contains(person2)){
            System.out.println(details.contains(person2));
        }

        else {
            System.out.println("Not found " +details.contains(person2) );
        }
        System.out.println("Removes a personobject");
        details.remove(person2);
        for (Person i : details) {
            i.display();
        }

    }
}