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
        Worker worker5 = new Worker("Marek", 2220, 63137, "2019-04-03", "Developer");
        Worker worker6 = new Worker("Jurek", 3100, 63137, "2015-02-29", "Junior Developer");
        Worker worker7 = new Worker("Marek", 2220, 43976, "2025-12-16", "Old Developer");

        Manager manager1 = new Manager("Eugeniusz", 5000, 51235, "2010-01-10", "Head of Department");
        Manager manager2 = new Manager("Barbara", 7000, 56216, "2012-05-22", "Head of Department 2.0");

         List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(worker6);
        employees.add(worker7);
        employees.add(manager1);
        employees.add(manager2);

        for (Employee employee : employees) {
            System.out.println(employee.getName() + " has code: " + employee.hashCode());
        }
       
        Worker duplicateIdWorker = new Worker("Jurek", 3100, 63137, "2015-02-29", "Junior Developer");

        for (Employee employee : employees) {
            if (employee.equals(duplicateIdWorker)) {
                System.out.println("Worker with duplicate id: " + employee.getName());
            }
        }

        for (Employee employee : employees) {
           employee.work();
           System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() + ", Position: " +
                   employee.getPosition() + ", Hire date: " + employee.getHireDate() + ", Salary: " +
                   employee.getSalary() + ")");

        }
    }
}
