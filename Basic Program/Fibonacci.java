import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int n, n1, n2, n3, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
         sc.close();

        System.out.println("Fibonacci Series: ");
        n1 = 0;
        n2 = 1;
        System.out.println(n1 + "\n" + n2 + " ");
        
        for(i = 3; i <= n; i++){
           n3 = n1 + n2;
           System.out.println(n3 + " "); 
           n1 = n2;
           n2 = n3;
        }
    }
}
