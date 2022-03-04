import java.util.Scanner;
public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0,b=0,c=0;
        try {
            System.out.println("Nhap vao cac so");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Nhap sai du lieu !");
        }
        if (a >= b && a>= c){
            System.out.print("The greatest: ");
            System.out.println(a);
          }
          else if (b >= c) {
            System.out.print("The greatest: ");
            System.out.println(b);        
          }
          else {
            System.out.print("The greatest: ");
            System.out.println(c);
          }
    }
}
