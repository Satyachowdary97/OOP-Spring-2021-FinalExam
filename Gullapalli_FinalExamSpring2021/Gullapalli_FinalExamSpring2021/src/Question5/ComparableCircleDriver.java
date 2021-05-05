/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Gullapalli Sai Satyanarayana
 */
public class ComparableCircleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Double> list = new ArrayList<>();
        ComparableCircle com1 = new ComparableCircle(5);
        ComparableCircle com2 = new ComparableCircle(10);
        ComparableCircle com3 = new ComparableCircle(15);
        ComparableCircle com4 = new ComparableCircle(20);
        ComparableCircle com5 = new ComparableCircle(25);
        list.add(com1.getArea());
        list.add(com2.getArea());
        list.add(com3.getArea());
        list.add(com4.getArea());
        list.add(com5.getArea());
        System.out.println("Before sorting the area:");
        for (Double d : list) {
            System.out.println(d);
        }
        Collections.sort(list);
        System.out.println("After sorting the area:");
        for (Double al1 : list) {
            System.out.println(al1);
        }
        if (com1.compareTo(com2) < 0) {
            System.out.println("c2 is the larger instance");
        } else if (com1.compareTo(com2) > 0) {
            System.out.println("c1 is larger instance :");
        } else {
            System.out.println("Both are equal");
        }

    }

}
