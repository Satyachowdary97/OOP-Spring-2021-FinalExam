/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

import java.util.Scanner;

/**
 *
 * @author Gullapalli Sai Satyanarayana
 */
public class RandomIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int randomArray[] = new int[100];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 100);
        }
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the Index :");
            int index = sc.nextInt();
            System.out.println("value is :" + randomArray[index]);
        } catch (ArrayIndexOutOfBoundsException exp) {
            System.out.println("Out of Bounds");

        }

    }

}
