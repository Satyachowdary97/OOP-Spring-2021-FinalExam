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
public class CheckedException3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc;
        try {
            sc = new Scanner(new File("gulapalli.txt"));
            while (sc.hasNext()) {
                int a = sc.nextInt();
                System.out.println(a);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found Exception");
        }

    }

}
