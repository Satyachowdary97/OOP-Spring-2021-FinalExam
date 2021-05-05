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
public abstract class Interface_b implements Interface_a {

    private final int x;
    private final int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Interface_b(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int Multiply() {
        return x * y;
    }
}
