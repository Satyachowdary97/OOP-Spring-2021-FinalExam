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
public class DirectSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n value:");
        int a = scanner.nextInt();
        System.out.println("Sum of " + a + " digits from 1 to " + a + " is:" + Sum(a));
    }

    private static int Sum(int n) {
        if (n > 1) {
            return n + Sum(n - 1);
        } else {
            return 1;
        }

    }

}
