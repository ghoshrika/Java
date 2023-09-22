import java.util.Scanner;

public class recurFactorial {
    public static int calculateFactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact = calculateFactorial(n-1);
        int fact_n = n * fact;
        return fact_n;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
        sc.close();
        int result= calculateFactorial(n);
        System.out.println("Factorial of " +n+ " is: "+result);
    }
}
