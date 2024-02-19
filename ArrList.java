import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();

        food.add("burger");
        food.add("pizza");
        food.add("hotdog");
        //food.addFirst("ye");

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));

        food.set(0, ""); //updates index 0

        food.remove(2);

        food.clear(); // clears the array list

        }
    }
}
