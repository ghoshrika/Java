// Print 1 to n numbers without using loops;

import java.util.Scanner;

public class Recursion1{
    public static void printNumbers(int n){
        if(n>0){
            printNumbers(n-1);
            System.out.println(n);
        } 
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        n = sc.nextInt();
        sc.close();
        printNumbers(n);
    }
}