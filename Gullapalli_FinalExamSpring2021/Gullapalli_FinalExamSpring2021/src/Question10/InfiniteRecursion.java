/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

import java.util.Scanner;

/**
 *
 * @author Gullapalli Sai Satyanarayana
 */
public class InfiniteRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Enter n :");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        try {
            System.out.println(infiniteRec(a));
        } catch (java.lang.StackOverflowError ex) {
            System.out.println("infinite recursion" + ex);
        }
    }

    private static String infiniteRec(int a) {
        if (true) {
            return "infinite recursion" + "\n" + infiniteRec(a + 1);
        } else {
            return "";
        }

    }

}
