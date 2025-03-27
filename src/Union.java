
import java.util.HashSet;

public class Union {
    public static void main(String[] args) {
        HashSet<Integer>Union = new HashSet<Integer>();
        HashSet<Integer>Union1 = new HashSet<Integer>();
        Union.add(1);
        Union.add(2);
        Union.add(3);
        Union.add(4);
        Union1.add(4);
        Union1.add(6);
        Union1.add(7);
        Union1.add(8);
        HashSet<Integer>UnionSet = new HashSet<>(Union1);
        UnionSet.addAll(Union);
        System.out.println(UnionSet);
    }
}
