package org.example.activity124;

// 2.3 Create AbstractActivity Class

public class AbstractActivity {

    public static void main(String[] args) {

        // 2.3.1 call introduce from employee
        // * added some test data

        Employee employee = new Employee("tester", "B", 800);
        employee.setName("Mike");
        employee.setAge(23);
        employee.introduce();

        // 2.3.2 call introduce from student
        // * added some test data

        Students students = new Students();
        students.setSchoolName("AlfaBeta");
        students.introduce();

    }

}
