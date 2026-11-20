package org.example.activity124;

import java.util.List;

// 2.1) Create Employee class
// 2.1.1) Employee class should extend Person class

public class Employee extends Person {

    // 2.1.2) Create attributes: jobTitle, company, salary

    private String jobTitle;
    private String company;
    private int salary;

    // 2.1.3) Add different constructors

    public Employee() {
    }

    public Employee(String jobTitle, String company, int salary) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    // 2.1.4) Add getters and setters

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }

    // 2.1.5) Override method introduce of person class -> "My name is < name> and i am <age› years old I am work as < jobTitle> in ‹company›" and my salary is ‹salary›.

    public void introduce() {
        System.out.println("My name is " + getName() + " and I am " + getAge() + " years old");
        System.out.println("I work as " + jobTitle + " in company " + company + " and my salary is " + salary);

    }

    // 4.3) Create method which returns the name of the employee whose salary is highest among the 5: getHighestPaidEmp() [This method should be in Employee Class

    public static String getHighestPaidEmp(List<Employee> empList) {

        Employee highestPaid = empList.get(0);

        for (int i = 1; i < empList.size(); i++) {
            Employee current = empList.get(i);

            if (current.getSalary() > highestPaid.getSalary()) {
                highestPaid = current;
            }
        }

        return highestPaid.getName();
    }
}
