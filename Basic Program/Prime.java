import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        int num, i, temp=0;
        System.out.println("Enter a number to check: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        for(i = 2; i < num; i++){
            if(num % i == 0){
                temp++;
                break;
            }
        }
        if(temp == 0){
            System.out.println(num + " is a Prime Number.");
        }
        else{
            System.out.println(num + " is not a Prime Number.");
        }
    }
}
