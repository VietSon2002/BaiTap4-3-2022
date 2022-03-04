import java.util.Scanner;
import java.util.Math;
public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a=0;
        try {
            System.out.println("Nhap vao 1 so: ");
            a = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("Nhap sai du lieu !");
        }
        if (a == 0) {
            System.out.println("Zero");
        }
        if (a > 0) {
            System.out.println("positive number");
            if (Math.abs(a) < 1) {
                System.out.println("small");
            } else System.out.println("large");
        } else {
            System.out.println("negative number");
            if (Math.abs(a) < 1) {
                System.out.println("small");
            } else System.out.println("large");
        }
        }
}