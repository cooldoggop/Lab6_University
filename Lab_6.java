import java.util.Scanner;
import static java.lang.Math.*;

public class Lab_6 {
    //methods 1-4 and 7 and 9-10
    public static int Factorial(int a){
        int result = 1;
        for (int i = 1; i <= a; i++){
            result *= i;
        }
        return result;
    }
    public static double num1_1(int x, int n){
        double s;
        s = x;
        for (int i = 3; i<= n; i += 2){
            s += (pow(x,i))/(Factorial(n));
        }
    System.out.println("Сумма первых N членов ряда");
    return s;
    }
    public static double num1_2(int x, int m){
        double s;
        s = x;
        int n;
        n = 3;
        while (s < m){
            s += (pow(x,n))/(Factorial(n));
            n += 2;
        }
        System.out.println("Сумма членов ряда, которые меньше M");
        return s;
    }
    public static int num2(double n, double k){
       int month;
       double s;
       month = 1;
       s = k;
       while (s < n){
           if (month % 3 == 0){
              k *= 1.05;
           }
           if (month % 2 == 0){
               n *= 1.0315;
           }
           if (month % 5 == 0){
               n *= 0.977;
           }
           s += k;
           month ++;
       }
       return month;
    }
    public static int num3_1(){
        int sum = 0;
        for (int i = 1; i <= 8; i++){
            for (int j = 1; j <= i; j++) {
                sum += pow((j + i), 2);
            }
        }
        return sum;
    }
    public static int num3_2(){
        int umnozh = 1;
        for (int i = 1; i <=5; i++){
            for (int j = 1; j <= i; j++){
                umnozh *= j;
            }
        }
        return umnozh;
    }
    public static double num3_3(){
        double i,j,k,a = 0,b = 0,f=1;
        for (i=1;i<=8;i++){
            for(j=i;j<=2*i-1;j++){
                for (k=i+j;k<=2*(i+j);k++){
                    a += (2*j-3*(i-0.5*k));
                }
                b += a;
            }
            f *= b;
        }
        return f;
    }
    public static void num4(double a, int sc){
        //double n =0.1;
        double i;
        double result = 0;
        for (int j = 1;j <= 10; j++ ){
            i = a*sc;
            result += (int)i * pow(0.1,j);
            a = i - (int)i;
        }
        System.out.println(result);
    }
    public static void num7(){
        int i = 1;
        for (int j = 1; j <= 9; j += 1){
            System.out.println(i + " % " + j + " = "+ (i % j) + "  " +
                    (i+1) + " % " + j + " = "+ ((i+1) % j) + "  " +
                    (i+2) + " % " + j + " = "+ ((i+2) % j) + "  " +
                    (i+3) + " % " + j + " = "+ ((i+3) % j) + "  " +
                    (i+4) + " % " + j + " = "+ ((i+4) % j) + "  " +
                    (i+5) + " % " + j + " = "+ ((i+5) % j) + "  " +
                    (i+6) + " % " + j + " = "+ ((i+6) % j) + "  " +
                    (i+7) + " % " + j + " = "+ ((i+7) % j) + "  " +
                    (i+8) + " % " + j + " = "+ ((i+8) % j) + "  ");
        }
    }
    public static void nutonfunc(double e,double x,double y,double p,double n){
        double y_i = 1/p*((p - 1)*y+x/pow(y, p - 1));
        n++;
        if (abs(y_i - y) > e) nutonfunc(e, x, y_i, p, n);
        else System.out.println(e + ", " + (y_i) + ", " + n);
    }
    public static void num9(double x, double p){
        int n = 0;
        double y0 = exp(log(x*(p+1))/p)*0.9;
        for (double e = 0.01; e > 0.000001; e = e*0.1) {
            nutonfunc(e,x,y0,p,n);
        }
    }
    public static void num10(){
        double sum;
        double h;
        for(double n = 10;n <= 10000; n *= 10){
            h = 1/n;
            sum = 0;
            for (int i = 1; i < n; i++){
                sum += (((pow(sin(n-h*i),2))+cos(pow(n-h*i,2)+5)+6+(pow(sin(n-h*(i-1)),2))+cos(pow(n-h*(i-1),2)+5)+6)/2) * h;
            }
            System.out.println(n + "          " + h + "         " + sum + "         5.18" + "       "+ abs(sum - 5.18));
        }
    }
    //ending of methods
    //Body of the program
    public static void main(String[] args) {
        System.out.println("Введите номер задачи от 1 до 10");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int n,k,x;
        switch (num) {
            case 1:
                System.out.println("Input x, n & m");
                x = in.nextInt();
                n = in.nextInt();
                int m = in.nextInt();
                System.out.println(num1_1(x,n));
                System.out.println(num1_2(x,m));
                break;
            case 2:
                    System.out.println("Input n (PC) and k (Zp)");
                    n = in.nextInt();
                    k = in.nextInt();
                    System.out.println(num2(n,k) + " Months need to buy pc");
                break;
            case 3:
                System.out.println("f1 = " + num3_1());
                System.out.println("f2 = " + num3_2());
                System.out.println("f3 = "+ num3_3());
                break;
            case 4:
                System.out.println("Input number");
                double a = in.nextDouble();
                int ask = 1;
                while (ask == 1){
                    System.out.println("Input sc");
                    int sc = in.nextInt();
                    if (sc >=2 && sc <= 10 && a<1 && a>0){
                        num4(a,sc);
                    }
                    else {System.out.println("Not correct input");}
                    System.out.println("Do u want to change sc 1-yes, else - number no");
                    ask = in.nextInt();
                }

                break;
            case 7:
                num7();
                break;
            case 9:
                System.out.println("Input p and x");
                double p = in.nextDouble();
                double x1 = in.nextDouble();
                num9(x1,p);
                break;
            case 10:
                num10();
            default:
                System.out.println("Input another one number or check it in repositories");
        }
    }
}
