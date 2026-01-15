import java.util.Scanner;
import java.lang.Math;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");

        System.out.print("введите x: ");
        double x = scanner.nextDouble();
        System.out.print("введите y: ");
        double y = scanner.nextDouble();
        System.out.print("введите a: ");
        double a = scanner.nextDouble();
        System.out.print("введите z: ");
        double z = scanner.nextDouble();
        System.out.print("введите b: ");
        double b = scanner.nextDouble();
        double g;

        if (y > 0 && Math.pow(x * y, 2) > 0) {
            double maxEl = Math.pow(y, 3);
            if (maxEl < Math.sqrt(1 + Math.pow(z * x, 2))) {
                maxEl = Math.sqrt(1 + Math.pow(z * x, 2));
            }
            g = maxEl;
        } else if (y > 0 && Math.pow(x*y, 2) <= 0) {
            double maxEl = x;
            if (maxEl < y) {
                maxEl = y;
            }
            double minEl = a + x;
            if (minEl > maxEl) {
                minEl = maxEl;
                }
            g = minEl;}
            else {
            g = -b * Math.E*(y);
            
            scanner.close();
        }

        System.out.print(g);
    }
}

