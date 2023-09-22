import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int num, i, factorial=1;
        System.out.println("Enter the number to find Factorial: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        for(i = 1; i <= num; i++){
            factorial = factorial * i;
        }
         System.out.println("Factorial of" + num + "is: " + factorial);
    }
}
