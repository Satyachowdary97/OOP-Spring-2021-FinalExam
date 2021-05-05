/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3DownCasting;

/**
 *
 * @author Gullapalli Sai Satyanarayana
 */
public class DowncastingDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p = new Person("Satya Chowdary", "Gullapalli", 24);
        System.out.println(p.getPersonDetails());
        Engineer eng = new Engineer("CSE", " Software Developer", "Strateology", "Satya Chowdary", "Gullapalli", 23);
        System.out.println(eng.getPersonDetails());
        p = eng;
        eng = (Engineer) p;
        System.out.println(eng.getPersonDetails());
    }
}
