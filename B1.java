import java.util.Scanner;
public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        System.out.println("Nhap vao mot so" );
        try {
            a = sc.nextInt();
            if (a >= 0) {
                System.out.println("Number is positive");
            }
            else {
                System.out.println("Number is negative");
            }
        } catch (Exception e) {
            System.out.println("Nhap sai du lieu ! ");
        }
        
    }
}
