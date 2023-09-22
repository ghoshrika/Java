import java.util.Scanner;
public class Reverse_Num {
    public static void main(String[] args) {
        int num, reverse = 0, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Original Number: ");
        num = sc.nextInt();
        sc.close();

        while(num != 0){
            temp = num % 10;
            reverse = reverse * 10 + temp;
            num = num / 10;
        }
        System.out.println("Reverse Number of the Original Number is: " + reverse);
    }
}
