/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

import java.util.Scanner;

/**
 *
 * @author Gullapalli Sai Satyanarayana
 */
public class UncheckedException2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a Value:");
            int a = sc.nextInt();
            System.out.println("Enter d value:");
            double d = sc.nextDouble();
            System.out.println("Enter b value:");
            boolean b = sc.nextBoolean();
            System.out.println("Values of a:" + a + ", d : " + d + " , b :" + b);
        } catch (java.util.InputMismatchException ex) {
            System.out.println("check the input type: " + ex);

        }
    }
}
