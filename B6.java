import java.util.Scanner;
public class B6 {
  public static void main(String[] args) {
    int i = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap vao 1 so: ");
    int n =sc.nextInt();
    int num;
    String primeNumber = "";
    for(i =1; i <= n;i++){
        int counter = 0;
        for(num = i; num >= 1;num--){
            if( i % num == 0){
                counter = counter + 1;
            }
        }
        if(counter == 2){
            primeNumber = primeNumber + i + " ";
        }
    }
    System.out.print("Prime numbers from 1 to n are: ");
    System.out.print(primeNumber);
    }
}