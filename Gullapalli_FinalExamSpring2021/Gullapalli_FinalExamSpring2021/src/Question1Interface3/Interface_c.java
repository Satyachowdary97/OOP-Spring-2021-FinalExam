/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1Interface3;

/**
 *
 * @author Gullapalli Sai Satyanarayana
 */
public class Interface_c implements Interface_b, Interface_a {

    @Override
    public void print() {
        System.out.println("declared in Interface_b and implementing in Interface_c");
    }

    @Override
    public void display() {
        System.out.println("declared in Interface_a and implementing in Interface_c");
    }

}
