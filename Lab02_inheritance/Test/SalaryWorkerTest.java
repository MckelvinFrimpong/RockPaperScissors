import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker sWorker1, sWorker2;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        sWorker1 = new SalaryWorker("000001", "Mickey", "Frimpong", "Mr.", 2003, 20.50, 41860);
        sWorker2 = new SalaryWorker("000002", "Amber", "Jackson", "Mrs.", 2004, 30, 52000);
    }

    @org.junit.jupiter.api.Test
    void calculateWeeklyPay() {
        assertEquals(1000, sWorker2.calculateWeeklyPay(40));
    }

    @org.junit.jupiter.api.Test
    void displayWeeklyPay() {
        assertEquals("805.00", sWorker1.displayWeeklyPay(50));
    }
}