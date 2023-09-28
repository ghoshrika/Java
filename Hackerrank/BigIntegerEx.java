/* In this problem, you have to add and multiply huge numbers! 
These numbers are so big that you can't contain them in any ordinary data types like a long integer.

Use the power of Java's BigInteger class and solve this problem.

Input Format

There will be two lines containing two numbers, a and b.

Constraints

 a and b are non-negative integers and can have maximum 200 digits.

Output Format

Output two lines. The first line should contain a+b, 
and the second line should contain a x b .Don't print any leading zeros. */

import java.math.BigInteger;
//import java.io.*;
import java.util.*;

public class BigIntegerEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        BigInteger sum;
        BigInteger multiply;
        BigInteger a = new BigInteger(input1);
        BigInteger b = new BigInteger(input2);
        sum = a.add(b);
        System.out.println(sum);
        multiply = a.multiply(b);
        System.out.println(multiply);
        sc.close();
    }
}