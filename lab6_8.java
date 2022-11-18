import static java.lang.Math.*;
import java.util.*;

public class lab6_8 {
    public static class FunctionMy {
        public static double FunctionMy1(double x) {
            double y = 1;
            return ((sqrt(abs(x * x - 6))) - (sqrt(abs(y * y - 5))))
                    / (1 + ((x * x) / (pow(y, 3) + 1)) + ((y * y) / (pow(x, 3) + 1)));
        }

        public static double FunctionMy2(double x) {
            double z = 1;
            return pow(x, 3) * (pow(atan(z), 3) + E);
        }
    }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            double sum = 0;
            for (int n = 1; n <= 10; n++) {
                System.out.println("Input x");
                double x = in.nextDouble();
                sum += FunctionMy.FunctionMy1(x) + FunctionMy.FunctionMy2(x);
            }
            System.out.println(sum);
        }
}
