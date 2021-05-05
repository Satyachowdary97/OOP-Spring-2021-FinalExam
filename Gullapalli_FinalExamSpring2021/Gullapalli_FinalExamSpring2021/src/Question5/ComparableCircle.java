/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author Gullapalli Sai Satyanarayana
 */
public class ComparableCircle extends Circle implements Comparable {

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object ob) {
        Circle c = (Circle) ob;
        return Double.compare(getArea(), c.getArea());

    }
}
