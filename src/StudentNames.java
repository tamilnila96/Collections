import java.util.ArrayList;

public class StudentNames {
    public static void main(String[] args) {
        ArrayList<String>StudentNames = new ArrayList<String>();
        StudentNames.add("Amsavarthini");
        StudentNames.add("Dhivya");
        StudentNames.add("Vanmathi");
        StudentNames.add("Dhaya");
        StudentNames.add("Priya");
        System.out.println("The entireList of student names are " + StudentNames);


         StudentNames.set(3,"Tamilnila");
        System.out.println("The Updated student names are " + StudentNames);

        StudentNames.remove(1);
        System.out.println("The List after removal : " + StudentNames);

        for(String i : StudentNames){
            System.out.println(" Iterating List : " + i);
        }

        int Size = StudentNames.size();
        System.out.println("The Size of List : " + Size);

        String studentatIndex2 =  StudentNames.get(2);
        System.out.println(" Student name atIndex 2 : " + studentatIndex2);

        String specificStudent = "Vanmathi";
        boolean containsStudent =StudentNames.contains(specificStudent);
        System.out.println(containsStudent);



        StudentNames.clear();
        System.out.println(StudentNames);
        System.out.println("The Size after Clearing " + StudentNames.size());




    }
}

