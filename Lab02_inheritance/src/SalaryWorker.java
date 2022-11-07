public class SalaryWorker extends Worker {

    private double annualSalary;

    public SalaryWorker(String IDnum, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(IDnum, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked){
        return annualSalary / 52;
    }
    @Override
    public String displayWeeklyPay(double hoursWorked) {
        String weeklyPay = String.format("%.2f", calculateWeeklyPay(0));
        return weeklyPay;
    }
}
