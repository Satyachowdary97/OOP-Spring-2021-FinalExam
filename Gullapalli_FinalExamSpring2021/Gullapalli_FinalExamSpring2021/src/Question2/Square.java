/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

/**
 *
 * @author Gullapalli Sai Satyanarayana
 */
public class Square extends GeometricObject implements Colorable {

    private double side1;

    public Square(double side1) {
        this.side1 = side1;
    }

    public double getSide1() {
        return side1;
    }

    @Override
    public double getArea() {
        return getSide1() * getSide1();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

}
