import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        int num, rem, rev=0, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:: ");
        num = sc.nextInt();
        temp = num;
        while(temp > 0){
            rem = temp % 10;
            rev = (rev * 10) + rem;
            temp = temp/10;
        }
        if(num == rev){
            System.out.println("\n   it is a Palindrome Number....");
        }
        else{
            System.out.println("\n   it is not a Palindrome Number....");
        }
        sc.close();
    }
}
