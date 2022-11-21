/*
Writing a program to count the number of bits that are set to 1 in an integer is a good way to get up
to speed with primitive types. The following program tests bits one￾at-a-time starting with the
least-significant bit. It illustrates shifting and masking; it also shows how to avoid hard-coding
the size of the integer word.

 */
package Bitwise;

public class CountBits {
    public static void main(String[] args) {
        int n = 13;
        short bit = countBits(n);
        System.out.println(bit);

    }

    private static short countBits(int n) {
        short numBits = 0;   // number of bits
        while (n!= 0) {
            numBits += (n & 1); // numBits + ((n%2)&1)

            n>>>=1; //Unsigned rightshift n  (n/2)
        }
        return numBits;
    }
}
