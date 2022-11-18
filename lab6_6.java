import java.lang.Math.*;
import java.util.*;

public class lab6_6 {
    public static class Oblast {
        public static boolean num5_1figure(double x, double y) {
            boolean out;
            if ((!(y > 3.0 * x + 24.0) || !(x > -8.0) || !(x < -6.0)) && (!(y > -6.0 * x - 30.0) || !(x > -6.0) || !(x < -5.0)) && (!(y > x + 5.0) || !(x > -5.0) || !(x < -2.0)) && (!(y > 8.0 * x + 26.0) || !(x < -2.0) || !(x > -4.0)) && !(y < -6.0) && (!(y < 2.0 * x + 10.0) || !(x > -8.0) || !(x < -6.0)) && (!(y < -x - 8.0) || !(x < -6.0) || !(x > -8.0)) && !(x <= -8.0) && !(y >= 6.0) && !(x >= -2.0)) {
                out = true;
            } else if ((x != -6.0 || y != 6.0) && (x != -2.0 || y != 2.0) && (y != -6.0 || !(x <= -4.0) || !(x >= -8.0)) && (x != -8.0 || y != 0.0)) {
                out = false;
            } else {
                out = true;
            }
            return out;
        }

        public static boolean num5_2figure(double x, double y) {
            boolean out = false;
            if ((!(y > 10.0 * x + 14.0) || !(x > -2.0) || !(x < -1.0)) && (!(y > -2.0 * x + 2.0) || !(x >= -1.0) || !(x <= 2.0)) && (!(y > 8.0 * x - 18.0) || !(x >= 2.0) || !(x <= 3.0)) && (!(y > -(1.0 * x) + 11.0) || !(x > 1.0) || !(x < 6.0)) && (!(y < 0.0 * x - 4.0) || !(x < 6.0) || !(x > 0.0)) && (!(y > -3.0 * x - 4.0) || !(x > 0.0) || !(x < 1.0)) && (!(y < 0.0 * x - 6.0) || !(x < 1.0) || !(x > -2.0)) && !(x <= -2.0) && !(x >= 6.0) && !(y >= 6.0) && !(y <= -7.0)) {
                out = true;
            } else if ((x != -2.0 || y != -6.0) && (x != -1.0 || y != 4.0) && (x != 2.0 || y != -2.0) && (x != 3.0 || y != 6.0) && (x != 6.0 || y != 1.0) && (x != 0.0 || y != -4.0) && (x != 1.0 || y != -7.0)) {
                out = false;
            } else {
                out = true;
            }
            return out;
        }

        public static boolean infigure(double x, double y) {
            return num5_1figure(x, y) || num5_2figure(x, y);
        }

        public static boolean Checkout() {
            System.out.println("check dots? 1 - yes , 0 - no");
            Scanner in = new Scanner(System.in);
            int ans = in.nextInt();
            return ans == 1;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            boolean checkout = Checkout();
            while (checkout) {
                System.out.println("input x and y");
                double x = in.nextDouble();
                double y = in.nextDouble();
                System.out.println(Oblast.infigure(x, y));
                checkout = Checkout();
            }
        }
    }
}