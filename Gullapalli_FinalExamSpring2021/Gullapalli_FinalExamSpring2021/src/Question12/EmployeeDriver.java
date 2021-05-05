/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Gullapalli Sai Satyanarayana
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Employee> empList = new ArrayList<Employee>();
        Employee empobj1 = new Employee(1, "SaiNath", 1111.1);
        empList.add(empobj1);
        Employee empobj2 = new Employee(2, "Satya", 2222.2);
        empList.add(empobj2);
        Employee empobj3 = new Employee(3, "Vishal", 3333.3);
        empList.add(empobj3);
        Employee empobj4 = new Employee(4, "Bharath", 4444.4);
        empList.add(empobj4);
        Employee empobj5 = new Employee(5, "Manoj", 5555.5);
        empList.add(empobj5);
        Employee empobj6 = new Employee(6, "Vishnu", 6666.6);
        empList.add(empobj6);
        System.out.println("Displaying original Employee List Elements(before sorting):");
        for (Employee employeeList1 : empList) {
            System.out.println(employeeList1);
        }
        Collections.sort(empList);
        System.out.println("Sorted the list by using empId(Natural Ordering):");
        for (Employee employeeList1 : empList) {
            System.out.println(employeeList1);
        }
        Collections.sort(empList, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                if (emp1.getEmpSalary() < emp2.getEmpSalary()) {
                    return -1;
                }
                if (emp1.getEmpSalary() > emp1.getEmpSalary()) {
                    return 1;
                } else {
                    return 0;
                }
            }

        });
        System.out.println("Sorting the Employee details by Salary:");
        for (Employee employeeList : empList) {
            System.out.println(employeeList);
        }

        Collections.sort(empList, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                if (emp1.getEmpName().compareTo(emp2.getEmpName()) == 0) {
                    return emp1.getEmpName().compareTo(emp2.getEmpName());
                } else {
                    return emp1.getEmpName().compareTo(emp2.getEmpName());
                }
            }
        });
        System.out.println("Sorting the Employee details by name:");
        for (Employee employeeList1 : empList) {
            System.out.println(employeeList1);
        }

    }

}
