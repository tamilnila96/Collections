import java.util.ArrayList;
public class SearchingElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        if (colors.contains("Blue")) {
            System.out.println("Blue is found");
        } else {
            System.out.println("Not found");
        }
    }
}
