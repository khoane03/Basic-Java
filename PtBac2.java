import java.util.Scanner;

public class PtBac2 {
    public static void main(String[] args) {
        System.out.println("The quadratic equation 2 ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a : ");
        double a = sc.nextInt();
        System.out.println("Nhap b : ");
        double b = sc.nextInt();
        System.out.println("Nhap c :");
        double c = sc.nextInt();
        double Delta = Math.pow(b,2) - 4 * a * c;

        if (a == 0) {
            if (b == 0) {
                System.out.println("No sulution");
            } else if (c == 0) {
                System.out.println("Infinitely many solutions");
            } else {
                System.out.println("the quadratic equation 1");
                double x = -c / b;
                System.out.println("X = " + x);
            }
        } else {
            if (Delta == 0) {
                System.out.println("Double solution");
                double x = -b / 2 * a;
                System.out.println("X1 = X2 =" + x);

            } else if (Delta > 0) {
                System.out.println("Two discriminant solutions");
                double x1 = (-b - Math.sqrt(Delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(Delta)) / (2 * a);
                System.out.println("X1 = " + x1);
                System.out.println("X1 = " + x2);
            } else {
                System.out.println("No solution");
            }

        }
    }
}
