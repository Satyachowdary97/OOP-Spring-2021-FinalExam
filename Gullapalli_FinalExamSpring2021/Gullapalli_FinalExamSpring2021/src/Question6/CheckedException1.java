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
public class CheckedException1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner scannner;

        scannner = new Scanner(new File("gullapalli.txt"));
        while (scannner.hasNext()) {
            int a = scannner.nextInt();
            System.out.println(a);
        }
    }

}
