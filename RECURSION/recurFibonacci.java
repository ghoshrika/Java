import java.util.Scanner;

public class recurFibonacci {
    public static void printFibonacci(int n1, int n2, int n){
        if(n==0){
            return;
        }
        int n3 = n1 + n2;
        System.out.println(n3);
        printFibonacci(n2, n3, n-1);
    } 
    public static void main(String[] args) {
        int n, n1 = 0, n2 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:: ");
        n = sc.nextInt();
        System.out.println("Fibonacci Series");
        System.out.println(n1);
        System.out.println(n2);
        sc.close();
        printFibonacci(n1, n2, n-2);
    }
}
