/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8Exception3;

import java.util.Scanner;

/**
 *
 * @author Gullapalli Sai Satyanarayana
 */
public class NegativeExceptionDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a value:");
        int n = scan.nextInt();
        if (n < 0) {
            try {
                throw new NegativeException(" value is less than 0");
            } catch (NegativeException ne) {
                System.out.println(ne);
            }
        } else {
            System.out.println("Square is :" + (n * n));
        }

    }

}
