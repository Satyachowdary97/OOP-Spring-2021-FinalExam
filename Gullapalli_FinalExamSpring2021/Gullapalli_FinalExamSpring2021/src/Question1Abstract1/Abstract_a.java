/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1Abstract1;

/**
 *
 * @author Gullapalli Sai Satyanarayana
 */
public abstract class Abstract_a {

    private int value;

    public Abstract_a(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String valSquare() {
        return "Square Value of X is :" + (getValue() * getValue());
    }

    public abstract void display();

}
