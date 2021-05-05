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
public class Throw1Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x value :");
        double x = scanner.nextInt();
        System.out.print("Enter y value :");
        double y = scanner.nextInt();
        if (y == 0) {
            try {
                throw new ArithmeticException("y value is not equal to 0");
            } catch (ArithmeticException ex) {
                System.out.println(ex);
            }
        } else {
            System.out.println("Division is :" + (x / y));
        }

    }

}
