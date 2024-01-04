import java.util.ArrayList;
import java.util.Arrays;

public class T7 {
    public static void main(String[] args) {
        String str = "Hello, world Alesia?";


        str = str.trim();
        String[] world = str.split("\\P{L}+");


        System.out.println(world.length);

    }
}


