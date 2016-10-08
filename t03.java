import java.util.Scanner;

public class t03 {

    public static  void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculation for F(x) = tg(2x)-3 on [a,b] with step h");
        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b:");
        double b = sc.nextDouble();
        System.out.println("Enter h:");
        double h = sc.nextDouble();

        double x = a;
        double result;
        System.out.println(" X  |  F(x) ");
        while (x<=b & x!=b)
        {
            result = Math.tan(2*x)-3;
            System.out.println(x + " | "+ result);
            x = x+h;
        }

    }

}
