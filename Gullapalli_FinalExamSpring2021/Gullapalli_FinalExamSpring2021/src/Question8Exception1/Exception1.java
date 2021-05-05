/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8Exception1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Gullapalli Sai Satyanarayana
 */
public class Exception1 {

    public void display() throws FileNotFoundException {

        Scanner scan = new Scanner(new File("gullapalli.txt"));
    }

}
