import java.util.ArrayList;
public class ColorsUsingArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Pink");
        colors.add("White");
        // To add one more color
        colors.add(1,"NavyBLue");
        //To remove one color
        colors.remove(3);
        System.out.println(colors);

    }
}
