/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3UpCasting;

/**
 *
 * @author Gullapalli Sai Satyanarayana
 */
public class UpcastingDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p = new Person("Satya Chowdary", "Gullapalli", 24);
        System.out.println(p.getPersonDetails());
        Person s = new Engineer("CSE", " Software Developer", "Strateology", "Satya Chowdary", "Gullapalli", 20);
        System.out.println(s.getPersonDetails());
        Teacher t = new Teacher("ACS", "SIUE", 5000, "Dr", "Rakesh", "Chandra", 25);
        System.out.println(t.getPersonDetails());
        Person per = new Teacher("ADB", "UHCL", 10000, "Dr", "Prudhvi", "Raju", 30);
        System.out.println(per.getPersonDetails());

    }
}
