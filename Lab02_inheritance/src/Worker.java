public class Worker extends Person {

    private double hourlyPayRate;

    public Worker(String IDnum, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(IDnum, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double totalPay = hourlyPayRate * hoursWorked;
        if (hoursWorked > 40) {
            totalPay = hourlyPayRate * 40 + (hourlyPayRate * 1.5) * (hoursWorked - 40);

        }
        else {
            totalPay = hourlyPayRate * hoursWorked;
        }
        return totalPay;
    }
    public String displayWeeklyPay (double hoursWorked) {
        double regHours;
        double regPay;
        double overtimeHours;
        double overtimePay;
        double totalPay;
        String weeklyPay;
        if (hoursWorked >= 40) {
            regHours = 40;
            overtimeHours = hoursWorked - 40;
        }
        else {
            regHours = hoursWorked;
            overtimeHours = 0;
        }
        overtimePay = overtimeHours * (hourlyPayRate * 1.5);
        regPay = regHours * hourlyPayRate;
        totalPay = overtimePay + regPay;
        weeklyPay = "Regular pay hours: " + regHours + "\nRegular pay: " + regPay + "\nOvertime hours: " + overtimeHours + "\nOvertime pay: " + overtimePay + "\nTotal pay: " + totalPay;
        String totalPayOutput = String.format("%.2f", totalPay);
        return totalPayOutput;
    }
}