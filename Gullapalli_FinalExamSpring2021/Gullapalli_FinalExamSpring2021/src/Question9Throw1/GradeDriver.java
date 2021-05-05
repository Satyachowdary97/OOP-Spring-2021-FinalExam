/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9Throw1;

import java.util.Scanner;

/**
 *
 * @author Gullapalli Sai Satyanarayana
 */
public class GradeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student marks:");
        int n = scanner.nextInt();
        try {
            Grade gr = new Grade(n);
            if (gr.getMarks() < 0 || gr.getMarks() > 100) {
                throw new InvalidException("Invalid Marks");
            }
            if (gr.getMarks() >= 90 && gr.getMarks() <= 100) {
                System.out.println("Result is :A Grade");
            } else if (gr.getMarks() < 90 && gr.getMarks() >= 80) {
                System.out.println("Result is :B Grade");
            } else if (gr.getMarks() < 80 && gr.getMarks() >= 70) {
                System.out.println("Result is :C Grade");
            } else {
                System.out.println("Result is :Fail");
            }

        } catch (InvalidException ex) {
            System.out.println(ex);
        }

    }

}
