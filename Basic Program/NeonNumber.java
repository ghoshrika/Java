import java.util.Scanner;
public class NeonNumber {
    public static void main(String[] args) {
        int num, square, digitsum;
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = n.nextInt();
        n.close();
        square = num * num;
        digitsum = 0;

        while(square > 0){
            digitsum = digitsum + (square % 10);
            square = square / 10;
        }
        if(digitsum == num){
            System.out.println(num + " is a Neon Number.");
        }
        else{
            System.out.println(num + " is not a Neon Number.");
        }
    }
}
