/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8Exception1;

import java.io.FileNotFoundException;

/**
 *
 * @author Gullapalli Sai Satyanarayana
 */
public class Exception1Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Exception1 ex = new Exception1();
        try {
            ex.display();
        } catch (Exception exc) {
            System.out.println(exc);
        }

    }

}
