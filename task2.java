
import java.util.ArrayList;
import java.util.Collections;

public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(51);
        list.add(97);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }
}


