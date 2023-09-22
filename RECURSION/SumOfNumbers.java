// Print Sum of First n Natural Numbers using Recursion;

import java.util.Scanner;

public class SumOfNumbers {
    public static void printSum(int i, int n, int sum){
        if(i==n){
            sum += i;
            System.out.println("Sum is: "+sum);
            return;
        }
        sum += i;
        printSum(i+1, n, sum);
    }
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n:: ");
        n = s.nextInt();
        s.close();
        printSum(1, n, 0);
    }
}
