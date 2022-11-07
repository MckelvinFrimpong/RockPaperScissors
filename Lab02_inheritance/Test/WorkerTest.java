import static org.junit.jupiter.api.Assertions.assertEquals;

class WorkerTest {
    Worker w1,w2,w3;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        w1 = new Worker("000001", "Steve", "Smith", "Mr.", 2004, 19.50);
        w2 = new Worker("000002", "Jeff", "Ficsher", "Mr.", 1991, 11.50);
        w3 = new Worker("000003", "Roger", "Smith", "Mr.", 1960, 28.50);
    }

    @org.junit.jupiter.api.Test
    void calculateWeeklyPay() {
        assertEquals(214.5, w1.calculateWeeklyPay(11.0));
    }

    @org.junit.jupiter.api.Test
    void displayWeeklyPay() {
        assertEquals("809.25", w1.displayWeeklyPay(41));
    }
}