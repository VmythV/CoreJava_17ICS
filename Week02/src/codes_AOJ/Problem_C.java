package codes_AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class Problem_C {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        cout.println(cin.nextBigInteger().isProbablePrime(20)?1:0);
        cin.close();
        cout.close();
    }
}
