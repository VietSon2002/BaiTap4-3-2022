import java.util.Scanner;
import java.lang.Math;
public class B8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 so ");
        int a = sc.nextInt();
        a = Math.abs(a);
        int t = 1;
        for (int i = 1; i <= a; i++) {
            t = t * i;
        }
        System.out.println("Gia thua cua "+ a + " la "+t);
    }
}
