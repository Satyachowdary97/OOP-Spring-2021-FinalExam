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
public class Teacher extends Person {

    private String subject, college_name, prefix;
    private long salary;

    public Teacher(String subject, String college_name, long salary, String prefix, String fName, String lName, int age) {
        super(fName, lName, age);
        this.subject = subject;
        this.college_name = college_name;
        this.salary = salary;
        this.prefix = prefix;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCollege_name() {
        return college_name;
    }

    public void setCollege_name(String college_name) {
        this.college_name = college_name;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String getPersonDetails() {
        return getPrefix() + "." + super.getPersonDetails() + " Teacher";

    }

    @Override
    public String toString() {
        return super.toString() + "Teacher{" + "subject=" + subject + ", college_name=" + college_name + ", salary=$" + salary + '}';
    }

}
