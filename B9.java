import java.util.Scanner;
public class B9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2, r = 0;
        System.out.println("Nhap so can dao nguoc: ");
        num1 = sc.nextInt();
        num2 = num1;
        while(num1 != 0) {
            int d = num1 % 10;
            r = r * 10 + d;
            num1 /= 10;
          }
        System.out.printf("So nghich dao: "+ r);
    }
}