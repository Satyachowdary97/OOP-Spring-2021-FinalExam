/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9Throw2;

import java.util.Scanner;

/**
 *
 * @author Gullapalli Sai Satyanarayana
 */
public class Throw2Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n value :");
        int a = scanner.nextInt();
        try {
            System.out.println("Square of given number: " + a + " is :" + square(a));
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        }

    }

    public static int square(int n) throws ArithmeticException {
        if (n == 0) {
            throw new ArithmeticException("enter the value greater than 0");
        } else {
            return n * n;
        }

    }

}
