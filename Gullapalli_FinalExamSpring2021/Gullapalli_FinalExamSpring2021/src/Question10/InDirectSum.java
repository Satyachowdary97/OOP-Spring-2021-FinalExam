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
public class InDirectSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value:");
        int n = sc.nextInt();
        System.out.println("Sum of " + n + " digits from 1 to " + n + " is:" + Sum(n));
    }

    private static int Sum(int n) {
        if (n > 1) {
            return n + Sum1(n - 1);
        } else {
            return 1;
        }
    }

    private static int Sum1(int n) {
        if (n > 1) {
            return n + Sum(n - 1);
        } else {
            return 1;
        }

    }

}
