import java.util.ArrayList;

public class inheritanceDemo {

    public static void main(String[] args) {
        Worker employee1 = new Worker("000001", "James", "Doe", "Mr.", 2000, 10.70);
        Worker employee2 = new Worker("000002", "Jane", "lowe", "Mrs.", 2001, 10.75);
        Worker employee3 = new Worker("000003", "Janet", "rowe", "Miss.", 2002, 11.75);

        SalaryWorker salEmployee1 = new SalaryWorker("000004", "Blake", "Jones", "Mr.", 1952, 32.50, 72500);
        SalaryWorker salEmployee2 = new SalaryWorker("000005", "Natalie", "Jordan", "Mrs.", 1970, 18.75, 37600);
        SalaryWorker salEmployee3 = new SalaryWorker("000006", "Bob", "Hugh", "Mr.", 1950, 15.50, 31500);

        ArrayList<Worker> workers = new ArrayList<>();

        workers.add(employee1);
        workers.add(employee2);
        workers.add(employee3);
        workers.add(salEmployee1);
        workers.add(salEmployee2);
        workers.add(salEmployee3);

        System.out.println("-------------------------------------------------------------------------------------"); // Top of tabular display
        for(int i = 0; i < workers.size(); i++) { // For loop
            // Print worker info + weekly pay
            Worker worker = (Worker) workers.get(i);
            System.out.printf("%-30s", worker.formalName());
            System.out.printf("%-20s", "Week One");
            System.out.printf("%-20s", "Week Two");
            System.out.print("Week Three");
            System.out.println();
            System.out.print("ID #: " + worker.getIDnum());
            System.out.printf("%-18s", " ");
            System.out.printf("$" + worker.displayWeeklyPay(40));
            System.out.printf("%-13s", " ");
            System.out.print("$" + worker.displayWeeklyPay(50));
            System.out.printf("%-13s", " ");
            System.out.print("$" + worker.displayWeeklyPay(40));
            System.out.println();
            System.out.println("-------------------------------------------------------------------------------------");
        }
    }


}
