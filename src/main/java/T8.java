import java.util.ArrayList;

public class T8 {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();

        strList.add("Hello world!");
        strList.add("Summer day");
        strList.add("Winter day");
        strList.add("Alesia Su");

        for(int i = 0; i < strList.size(); i++){
            if(strList.get(i).startsWith("A")){
                strList.set(i, strList.get(i).toLowerCase());
            }
        }



        System.out.println(strList);
    }
}
