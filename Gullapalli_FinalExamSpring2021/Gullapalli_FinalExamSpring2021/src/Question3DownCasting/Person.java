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
public class Person {

    private String firstName, lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPersonDetails() {
        return getfirstName() + " " + getlastName();

    }

    @Override
    public String toString() {
        return "Human{" + "fName=" + firstName + ", lName=" + lastName + ", age=" + age + '}';
    }
}
