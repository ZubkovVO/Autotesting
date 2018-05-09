import java.util.ArrayList;
import java.util.List;

public class Revert {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        stringList.add("усревеР");
        stringList.add("ьтыб");
        stringList.add("ьседз");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
            String currentString = stringList.get(i);
            String resultArr = "";
            char[] massiv = currentString.toCharArray();
            for (int j = massiv.length - 1; j >= 0; j--) {
                resultArr = resultArr + massiv[j];
            }
            stringList.set(i, resultArr);
        }
        System.out.println(stringList);
    }
}
