/*
AP CS A
Name: ELLEN HERNANDEZ
Date: AUG. 30, 2025
Teacher: Ms. Gee
Assignment: 1A - Decimal to Binary Converter Pt. 1
Description: Write a program which will convert a base 10 integer (0 ≤ x < 256) to a binary number. This will ensure the
base 2 number will fit into 1 byte of storage (and will have 8 bits).
*/  
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type in a number in the input box below between 0-255.");
        int number = scan.nextInt();
        System.out.println("Binary:"+ toBinary(number));
    }
    public static String toBinary(int n){ //converts
        if (n == 0){
            return "0";
        }
        if (n == 1){
            return "1";
        }
            return toBinary (n/2)+(n%2);
    }
}
