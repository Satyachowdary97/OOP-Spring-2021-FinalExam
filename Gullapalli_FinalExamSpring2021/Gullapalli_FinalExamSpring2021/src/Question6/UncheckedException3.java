/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gullapalli Sai Satyanarayana
 */
public class UncheckedException3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Scanner scannner = new Scanner(new File("gullapalli.txt"));
        ArrayList<Integer> list = new ArrayList<>();
        while (scannner.hasNext()) {
            int a = scannner.nextInt();
            list.add(a);
        }
        try {
            System.out.print("Enter the Index to print the value:");
            int n = scan.nextInt();
            System.out.println("Value is :" + list.get(n));
        } catch (java.lang.Exception ex) {
            System.out.println(ex);
        }

    }

}
