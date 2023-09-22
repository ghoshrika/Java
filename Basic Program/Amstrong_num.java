import java.util.Scanner;
public class Amstrong_num {
    public static void main(String[] args) {
        int num, temp, rem, result = 0;
        System.out.println("Enter a number to check: ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        s.close();
        temp = num;
        while(temp != 0){
            rem = temp % 10;
            result = (int) (result + Math.pow(rem,3));
            temp = temp / 10;
        }
        if(result == num){
            System.out.println(num + " is an Amstrong Number.");
        }
        else{
            System.out.println(num + " is not an Amstrong Number.");
        }
    }
}
