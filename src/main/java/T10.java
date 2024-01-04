import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class T10 {

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>();

        stringList.add("Alesia");
        stringList.add("Have a good day!");
        stringList.add("Alesia");
        stringList.add("Hello");
        stringList.add("Alesia");

        Set<String> setList = new LinkedHashSet<>(stringList);

        stringList.clear();

        stringList.addAll(setList);
        setList.clear();

        System.out.println(stringList);




    }
}
