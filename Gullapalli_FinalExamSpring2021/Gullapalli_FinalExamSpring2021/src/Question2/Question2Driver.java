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
public class Question2Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GeometricObject[] geo = new GeometricObject[5];
        geo[0] = new Square(7);
        geo[1] = new Square(10);
        geo[2] = new Square(34.6);
        geo[3] = new Square(15);
        geo[4] = new Square(15);
        for (int i = 0; i < geo.length; i++) {
            System.out.println("Area of is :" + geo[i].getArea());
            System.out.print("Invoking howtoColor():");
            geo[i].howToColor();
        }

    }

}
