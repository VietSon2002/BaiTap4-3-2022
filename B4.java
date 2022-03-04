import java.util.Scanner;
public class B4 {
    public static void main(String[] args) {
        int n,b;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so");
        n = sc.nextInt();
        while (n <= 0) {
            System.out.println("Nhap 1 so phai lon hon 0");
            n = sc.nextInt();
        }
        while (n > 0) {
            b = n % 10;
            sum += b;
            n /= 10;
        }
         
        System.out.println("tong cac chu so: " + sum);
    }
}
