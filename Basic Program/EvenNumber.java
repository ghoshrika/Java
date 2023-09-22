import java.util.*;

public class EvenNumber {
    public static void main(String[] args) {
        int num,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range:: ");
        num = sc.nextInt();
        i = 2;
        System.out.println("Even numbers are: ");
        while(i<=num){
            System.out.println(i +" ");
            i = i+2;
        }
        sc.close();
    }
}
