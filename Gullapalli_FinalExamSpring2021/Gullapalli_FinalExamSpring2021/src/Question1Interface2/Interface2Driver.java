/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1Interface2;

/**
 *
 * @author Gullapalli Sai Satyanarayana
 */
public class Interface2Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Interface_c ex = new Interface_c(3, 8);
        System.out.println("Multiplication is :" + ex.Multiply());
        ex.display();
        ex.print();
    }

}
