/* Given two strings of lowercase English letters, A and B, perform the following operations:

Sum the lengths of A and B.
Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
Capitalize the first letter in A and B and print them on a single line, separated by a space. 
*/

import java.util.Scanner;

public class StringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        int sum = A.length() + B.length();
        System.out.println(sum);
        if(A.compareTo(B) > 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No"); 
        }
        String newA = A.substring(0,1).toUpperCase()+A.substring(1);
        String newB = B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(newA + " " + newB);
        sc.close();
    }
}
