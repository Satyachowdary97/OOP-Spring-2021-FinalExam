/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8Exception2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gullapalli Sai Satyanarayana
 */
public class Exception2Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(new File("gullapalli.txt"));
        Scanner scan = new Scanner(System.in);
        while (scanner.hasNext()) {
            int i = scanner.nextInt();
            list.add(i);
        }
        System.out.println("Enter b value :");
        int b = scan.nextInt();
        System.out.println("Enter c value:");
        int c = scan.nextInt();
        Exception2 ex = new Exception2();
        try {
            ex.multipleExceptions(list, b, c);
        } catch (ArithmeticException | IndexOutOfBoundsException ex1) {
            System.out.println(ex1);
        }
        try {

            System.out.println("Do you want to add element to the list and\n and invoke"
                    + "multipleExceptions() method");
            boolean d = scan.nextBoolean();
            if (d == true) {
                list.add(24);
                ex.multipleExceptions(list, b, c);
            }
            System.out.println("Done !!");
        } catch (Exception ex2) {
            System.out.println(ex2);
        }

    }

}
