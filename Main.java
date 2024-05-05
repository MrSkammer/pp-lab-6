import java.util.ArrayList;
import java.util.List;

import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Piotrek", 2000, 15234, "2017-05-13", "Developer");
        Worker worker2 = new Worker("Alicja", 1800, 23631, "2018-02-11", "Young Developer");
        Worker worker3 = new Worker("Bob", 2200, 34563, "2013-02-01", " Old Developer");
        Worker worker4 = new Worker("Bartek", 1900, 46543, "2020-07-31", "Junior Developer");

        Manager manager = new Manager("Eugeniusz", 5000, 51235, "2010-01-10", "Head of Department");

         List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);
       
        for (Employee employee : employees) {
            employee.work();
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() + ", Position: " +
                    employee.getPosition() + ", Hire date: " + employee.getHireDate() + ", Salary: " +
                    employee.getSalary() + ")");
        }
    }
}
