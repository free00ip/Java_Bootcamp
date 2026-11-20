package org.example.activity124;

import java.util.ArrayList;
import java.util.List;

// 4. Create EmployeeList class

public class EmployeeList {

    public static void main(String[] args) {

        // 4.1) Create 5 employee objects using constructor of the Employee class(Created in the
        // Object should have 3 details job Title, Company, Salary
        // * nothing was mentioned regarding their names, so some test data was added

        Employee employee1 = new Employee("manager", "A", 1500);
        employee1.setName("Alan");
        Employee employee2 = new Employee("developer", "C", 1800);
        employee2.setName("Mike");
        Employee employee3 = new Employee("director", "B", 3200);
        employee3.setName("Lucy");
        Employee employee4 = new Employee("developer", "B", 2750);
        employee4.setName("Jane");
        Employee employee5 = new Employee("hr", "C", 2470);
        employee5.setName("Dan");

        // 4.2) Create list (List «Employee >empList=new ArrayList <Employee>(;)of Employees and add all the employee objects in the list

        List<Employee> empList = new ArrayList<Employee>();

        empList.add(employee1);
        empList.add(employee2);
        empList.add(employee3);
        empList.add(employee4);
        empList.add(employee5);

        // 4.4) Print the statement: "The Employee whose salary is the highest is :"+getHighestPaidEmp(); [This call should be done in EmployeeList class]

        System.out.println("The employee whose salary is the highest is " + Employee.getHighestPaidEmp(empList));

    }

}
