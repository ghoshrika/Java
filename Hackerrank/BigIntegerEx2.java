/* Given a large integer,n,use the Java BigInteger class' 
isProbablePrime method to determine and print whether it's prime or not prime. */

import java.util.*;
import java.math.BigInteger;

public class BigIntegerEx2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        BigInteger n = sc.nextBigInteger();
        System.out.println(n.isProbablePrime(10) ? "prime" : "not prime");
        sc.close();

    }
}
