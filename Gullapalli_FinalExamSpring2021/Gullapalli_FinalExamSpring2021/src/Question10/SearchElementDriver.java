/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Gullapalli Sai Satyanarayana
 */
public class SearchElementDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(15);
        list.add(31);
        list.add(2);
        list.add(7);
        try {
            System.out.println("Enter element to search :");
            Scanner scanner = new Scanner(System.in);
            int e = scanner.nextInt();
            SearchElement search = new SearchElement(list);
            System.out.println("Element: " + e + " Found at index:" + search.search(e));
        } catch (NoSuchElementException ex) {
            System.out.println(ex);
        }

    }

}
