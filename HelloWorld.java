import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class HelloWorld {
    public static void main(String[] args) {
        double a[] = { 2.35, -4.15, 0, -3.1, 7.8, 6.3, -3.05, 1.5 };
        ArrayList<Double> b = new ArrayList<>();
        double c = 1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                b.add(a[i]);
                c = c * a[i];
            }
        }

        double sqrtResult = Math.sqrt(c);

        System.out.println(b);
        System.out.println(c);
        System.out.println(sqrtResult);
    }
}