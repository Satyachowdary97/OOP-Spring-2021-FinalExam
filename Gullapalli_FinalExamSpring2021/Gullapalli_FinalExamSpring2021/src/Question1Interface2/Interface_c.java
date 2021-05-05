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
public class Interface_c extends Interface_b implements Interface_a {

    public Interface_c(int x, int y) {
        super(x, y);
    }

    @Override
    public void print() {
        System.out.println("in Interface_c class");
        System.out.println("calling default print() in Interface_a");
        super.print(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        System.out.println("Value of X is :" + getX() + "Y is :" + getY());
    }

}
