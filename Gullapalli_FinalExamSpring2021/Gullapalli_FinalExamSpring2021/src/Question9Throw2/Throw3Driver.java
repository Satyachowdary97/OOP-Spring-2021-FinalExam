/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9Throw2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gullapalli Sai Satyanarayana
 */
public class Throw3Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InputMismatchException {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a integer value :");
            int i = scanner.nextInt();
            System.out.println("Enter a boolean value :");
            boolean boo = scanner.nextBoolean();
        } catch (InputMismatchException ie) {
            System.out.println(ie);
        }

    }

}
