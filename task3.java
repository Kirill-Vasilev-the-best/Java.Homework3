
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task3 {

    public static void main(String[] args) {
        Map<String, Integer> letters = new HashMap<String, Integer>();

        ArrayList<String> fakeArray = new ArrayList<String>();
        fakeArray.add("Земля");
        fakeArray.add("Меркурий");
        fakeArray.add("Венера");
        fakeArray.add("Земля");
        fakeArray.add("Марс");
        fakeArray.add("Юпитер");
        fakeArray.add("Сатурн");
        fakeArray.add("Уран");
        fakeArray.add("Нептун");
        fakeArray.add("Плутон");
        fakeArray.add("Сатурн");
        fakeArray.add("Земля");
        fakeArray.add("Юпитер");

        for (int i = 0; i < fakeArray.size(); i++) {
            String tempChar = fakeArray.get(i);

            if (!letters.containsKey(tempChar)) {
                letters.put(tempChar, 1);
            } else {
                letters.put(tempChar, letters.get(tempChar) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : letters.entrySet()) {
            System.out.println("Планета : " + entry.getKey() + ", Повторений = " + entry.getValue());
        }

    }
}


