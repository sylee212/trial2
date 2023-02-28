import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //ArrayList<Object> ar = new ArrayList<>(List.of("hello"));
        //System.out.println(ar);

        //String res = " hello ";
        //System.out.println(res);
        //res = res.replace("h","");
        //System.out.println(res);

//        Car c1 = new Car(10);
//        Car c2 = new Car(c1.price);
//        c2.price = 3;
//        System.out.println(c1.price);
//        System.out.printf("hi %d" , 10);
// left crtl + right ctrl + ?

        String[] ar = {"cool","not cool"};
        change(ar);
        System.out.println(ar[0]);

        Car c1 = new Car(10);
        System.out.println(c1);


    }
    public static void change(String[] arrr)
    {
        arrr[0] = "hello";
    }
}

