import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Piotrek", 2000, 1);
        Worker worker2 = new Worker("Alicja", 1800, 2);
        Worker worker3 = new Worker("Bob", 2200, 3);
        Worker worker4 = new Worker("Bartek", 1900, 4);

        Manager manager = new Manager("Eugeniusz", 5000, 5);

        System.out.println("Worker " + worker1.getName() +  " salary is: " + worker1.getSalary());
        System.out.println("Worker " + worker2.getName() +  " salary is: " + worker2.getSalary());
        System.out.println("Worker " + worker3.getName() +  " salary is: " + worker3.getSalary());
        System.out.println("Worker " + worker4.getName() +  " salary is: " + worker4.getSalary());
        System.out.println("Manager " + manager.getName() + " salary is: " + manager.getSalary());

        worker1.work();
        worker2.work();
        worker3.work();
        worker4.work();
        manager.work();
    }
}
