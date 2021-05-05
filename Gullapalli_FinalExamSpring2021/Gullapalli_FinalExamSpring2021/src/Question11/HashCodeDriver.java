/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

/**
 *
 * @author Gullapalli Sai Satyanarayana
 */
public class HashCodeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // creating the Objects of Equal class.
        HashcodeEquals g1 = new HashcodeEquals("aa", 1);
        HashcodeEquals g2 = new HashcodeEquals("aa", 1);

        // comparing above created Objects.
        if (g1.hashCode() == g2.hashCode()) {

            if (g1.equals(g2)) {
                System.out.println("Both Objects are equal. ");
            } else {
                System.out.println("Both Objects are not equal. ");
            }

        } else {
            System.out.println("Both Objects are not equal. ");
        }
    }

}
