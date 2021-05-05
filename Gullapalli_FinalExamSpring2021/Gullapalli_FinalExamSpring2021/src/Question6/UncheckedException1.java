/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Gullapalli Sai Satyanarayana
 */
public class UncheckedException1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner;
        try {
            scanner = new Scanner(new File("gullapalli.txt"));
            int abc = scanner.nextInt();
            while (true) {

                System.out.println(abc);
                abc = scanner.nextInt();
            }
        } catch (FileNotFoundException ffe) {
            System.out.println("File not found Exception");
        } catch (java.util.NoSuchElementException nsee) {
            System.out.println("No element found to read");
        }
    }
}
