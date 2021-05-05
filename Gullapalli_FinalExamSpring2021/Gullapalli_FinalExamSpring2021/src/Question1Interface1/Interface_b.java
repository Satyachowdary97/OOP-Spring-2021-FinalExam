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
public class Interface_b implements Interface_a {

    private final int x;

    public Interface_b(int x) {
        this.x = x;
    }

    @Override
    public int sum() {
        return i + x;
    }

    @Override
    public int multiply() {
        return i * x;
    }

    @Override
    public int subtract() {
        return i - x;
    }

    public void displayResults() {
        System.out.println("Sum of :" + i + ", " + x + " is :" + sum() + "\n"
                + "Multiplication of :" + i + ", " + x + " is :" + multiply() + "\n"
                + "Subtraction of :" + i + ", " + x + " is :" + subtract());
    }

}
