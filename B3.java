import java.util.Scanner;
public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 so: ");
        int a = sc.nextInt();
        int t =0; 
        for (int i = 0; i < a; i++) {
            t = t + i;
        }
        System.out.println("Tong la: "+ t);
    }
}
