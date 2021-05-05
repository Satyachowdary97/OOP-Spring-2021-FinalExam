/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1Interface1;

/**
 *
 * @author Gullapalli Sai Satyanarayana
 */
public class Interface1Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Interface_b in = new Interface_b(4);
        System.out.println("Sum is:" + in.sum());
        System.out.println("Multiplication is :" + in.multiply());
        System.out.println("Subtraction is :" + in.subtract());
        System.out.println("Invoking the display method:");
        in.displayResults();

    }

}
