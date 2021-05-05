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
public interface Interface_a {

    default void print() {
        System.out.println("default method in InterfaceEx2 class");
    }

    public abstract void display();
}
