/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 *
 * @author Gullapalli Sai Satyanarayana
 */
public class SearchElement {

    private ArrayList<Integer> list;
    private static int i = 0;

    public SearchElement(ArrayList<Integer> list) {
        this.list = list;
    }

    public int search(int n) {
        if (list.size() < i + 1) {
            throw new NoSuchElementException(n + " Element is not available in the list");
        }

        if (list.get(i) == n) {
            return i;
        } else {
            i = i + 1;
            return search(n);
        }

    }

}
