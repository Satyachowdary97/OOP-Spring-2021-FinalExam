/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8Exception2;

import java.util.ArrayList;

/**
 *
 * @author Gullapalli Sai Satyanarayana
 */
public class Exception2 {

    void multipleExceptions(ArrayList<Integer> a, int b, int c) throws ArithmeticException, IndexOutOfBoundsException {
        if (a.size() > 9) {
            throw new IndexOutOfBoundsException();
        } else {
            System.out.println("Prininting array list values:");
            for (Integer a1 : a) {
                System.out.println(a1);
            }
        }
        if (b <= 0 || c <= 0) {
            throw new ArithmeticException("Value should be greater than zero");
        } else {
            System.out.println("Division is of b ,c is :" + b / c);
        }
    }

}
